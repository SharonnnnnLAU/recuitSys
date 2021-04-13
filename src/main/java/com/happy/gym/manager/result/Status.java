package com.happy.gym.manager.result;

public enum Status {

    OK(0, "SUCCESS"), // 成功
    ARGS_NOT_ALLOW_NULL(1, "参数不能为空，请检查参数后再试"),  // 请求的参数存在为空
    REQUEST_DATA_NOT_EXIST(2, "请求数据不存在，请刷新后再试"), // 数据库数据不存在
    DB_OPERATE_FAILED(3, "网络貌似开小差，请刷新后重试"),     // 数据库操作失败
    ARGS_NOT_MATCH_NEED(4, "请求数据不规范，请检查后重试"),   // 请求参数不符合规范
    REDIS_OPERATE_FAILED(5, "网络貌似开小差，请稍后重试"),   // redis出现问题
    LOGIN_CAPTCHA_ERROR(6, "验证码错误,请重试"),   // 登陆验证码错误
    USER_NOT_EXIST(997, "该用户不存在，请添加用户后再操作"),    // 用户不存在
    ERROR(999, "未知错误");                               // 抛出的异常


    public Integer code;
    public String msg;

    private Status(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
