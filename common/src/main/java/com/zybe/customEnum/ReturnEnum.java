package com.zybe.customEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReturnEnum {
    SUCCESS(10000, "请求成功"),
    FAIL(-10000,"请求失败"),
    NO_APPID(-10001,"请求失败，缺少全局参数:appid"),
    NO_TIMESTAMP(-10002,"请求失败，缺少全局参数:timestamp"),
    NO_MSGID(-10003,"请求失败，缺少全局参数:msgid"),
    NO_SIGNATURE(-10004,"请求失败，缺少全局参数:signature"),
    NO_VERSION(-10005,"请求失败，缺少全局参数:version"),
    ILLEGAL_APPID(-10006,"appid不合法"),
    FORBIDDEN_APPID(-10007, "appid已禁用"),
    SECRET_EXCEPTION(-10008,"secret出现异常请联系管理员"),
    ERROR_SIGNATURE(-10009,"signature 签名验证错误，请联系管理员");

    private int code;
    private String message;
}
