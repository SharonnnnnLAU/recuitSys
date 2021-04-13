package com.happy.gym.manager.log;

import cn.hutool.json.JSONUtil;
import com.happy.gym.manager.result.R;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author Marveal
 * @date 2020/6/8 23:44
 */

@Aspect
@Component
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.happy.gym.controller.*.*(..))")
    public void logAspect(){}


    @Before("logAspect()")
    public void logBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String fullClassName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        //请求信息
        logger.info("==> info =============================================================================");
        logger.info("Request URI:{}, API:{}, Method Parameters:{}", request.getRequestURI(), fullClassName + "." + methodName, JSONUtil.toJsonStr(args));
    }


    @After("logAspect()")
    public void logAfter(JoinPoint joinPoint) {
        // todo
    }


    @AfterReturning(returning = "response", pointcut = "logAspect()")
    public void logAfterReturning(Object response) {
        if (response != null) {
            //响应信息
            logger.info("Response Parameters:{}", JSONUtil.toJsonStr(response));
        }
        logger.info("==> info end =========================================================================");
    }

    @AfterThrowing(pointcut = "logAspect()", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        // todo
    }
}
