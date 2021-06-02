package com.zybe.interceptor;

import com.zybe.customEnum.ReturnEnum;
import com.zybe.exception.CustomException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Value("${properties.auth}")
    private String auth;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!auth.equals(request.getHeader("auth"))) {
            throw new CustomException(ReturnEnum.Auth_ERROR);
        }
        return true;
    }
}
