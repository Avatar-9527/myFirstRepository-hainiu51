package com.hainiuxy.exception;
/*
自定义的异常类  通常继承自运行时的异常  因为不强制别人处理
 */
public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
