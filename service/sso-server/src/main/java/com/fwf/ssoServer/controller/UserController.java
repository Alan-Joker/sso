package com.fwf.ssoServer.controller;


import com.fwf.result.Result;
import com.fwf.ssoServer.utils.RedisUtil;
import com.fwf.utils.JwtUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Alan_
 * @since 2021-02-25
 */
@RestController
@RequestMapping("/ssoServer/user")
@CrossOrigin
public class UserController {

    @Autowired
    private RedisUtil redisUtil;



    @PostMapping("doLogin")
    public Result doLogin(@RequestParam("username")String username,
                          @RequestParam("password")String password){
        //登录成功跳回原地址
        if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
            //登录成功，生成token返回
            String token = JwtUtils.getJwtToken("1", username);
            redisUtil.set("token",token);
            //return "redirect:" + url + "?token=" + token;
            return Result.ok().data("token",token);
        }
        return Result.error().message("登录失败");
    }
}

