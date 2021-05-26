package com.zybe.controller;

import com.zybe.pojo.ReturnData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class ExceptionController {
    @GetMapping("/exception")
    public ReturnData exception(HttpServletRequest request) throws UnsupportedEncodingException {
        String code = request.getHeader("code").substring(1);
        int codeInt = -Integer.parseInt(code);
        return new ReturnData(codeInt, URLDecoder.decode(request.getHeader("message"),"utf-8")); }
}
