package com.fwf.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // lobook生成有参数构造方法
@NoArgsConstructor // 生成无参数构造
public class SsoException extends RuntimeException {

    private Integer code; // 异常状态码

    private String msg; // 异常信息


}