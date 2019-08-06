package com.ecust.utms.exception;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        //自定义异常
        super("用户不存在");
    }
}
