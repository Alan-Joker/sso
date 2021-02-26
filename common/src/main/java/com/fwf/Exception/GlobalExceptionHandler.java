package com.fwf.Exception;


import com.fwf.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alan_
 * @create 2020/12/21 20:41
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {



    //自定义异常
    @ExceptionHandler(SsoException.class) //所有异常都执行此方法
    @ResponseBody //为了返回数据
    public Result error3(SsoException e){
        return Result.error().code(e.getCode()).message(e.getMsg());
    }
}