package com.cc.exception;

/**
 * 自定义异常类
 */
public class SysException extends Exception {

    // 存储异常信息的
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public SysException(String message) {
        this.message = message;
    }
}
