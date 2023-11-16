package com.connectravel.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice // 컨트롤러에서 발생한 예외를 한 클래스에서 처리할 수 있게 해주는 @
public class ExceptionHandlerControllerAdvice {

    // 404예외처리 핸들러
    @ExceptionHandler(NoHandlerFoundException.class) // 컨트롤러가 적용된 빈 내에 발생하는 예외 처리해주는 @
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle404(NoHandlerFoundException e){
        return "error/notFound";
    }
    // 데이터베이스오류
    @ExceptionHandler(DataAccessException.class)
    public String handleDataAccessException(DataAccessException e) {
        e.printStackTrace();
        return "error/databaseError";
    }
    // 500에러처리
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        e.printStackTrace();
        return "error/serverError";
    }
}