package com.happy.gym.manager.exception;

import com.happy.gym.manager.result.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Marveal
 * @date 2020/6/8 22:59
 */

@ControllerAdvice
public class GlobalExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R handleException(Exception e) {
        logger.error("==> error =============================================================================");
        logger.error(e.getMessage(), e);
        logger.error("==> error end =========================================================================");
        return R.Error();
    }


    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public R handleBusinessException(BusinessException e) {
        logger.error("==> error =============================================================================");
        logger.error(e.getMessage(), e);
        logger.error("==> error end =========================================================================");
        return R.Error(e.status);
    }

}