package com.fwf.ssoclient.controller;


import com.fwf.result.Result;
import com.fwf.utils.JwtUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @Author Alan_
 * @create 2021/2/25 23:32
 */
@RestController
@RequestMapping("/client")
@CrossOrigin
public class HelloController {
    /**
     * 无需登录即可访问
     */
    @GetMapping("/employees")
    public Result hello(HttpServletRequest request){
        boolean flag = JwtUtils.checkToken(request);
        if(flag){
            //登录成功
            return Result.ok();
            //return "redirect:http://ssoserver.com:8080/ssoServer/user/login?redirect_url=http://client1.com:8081/client/employees";
        }else {
            //没登陆,重定向到登录界面进行登录，并携带此接口url，以便登录后访问
            return Result.error().message("请登录");
        }

    }

}
