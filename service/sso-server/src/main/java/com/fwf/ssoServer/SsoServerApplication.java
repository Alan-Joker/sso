package com.fwf.ssoServer;

import com.fwf.result.Result;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Alan_
 * @create 2021/2/25 22:51
 */
@SpringBootApplication
@MapperScan("com.fwf.ssoServer.mapper")
@ComponentScan("com.fwf")
public class SsoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class,args);
    }
}
