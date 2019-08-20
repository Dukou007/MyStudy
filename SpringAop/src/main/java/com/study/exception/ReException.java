package com.study.exception;

/**
 * @description:自定义异常
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/20 10:39
 */
public class ReException extends RuntimeException {
    private Integer statusCode;
    private String message;

    public ReException() {

    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
