package com.zybe.controller;

import com.zybe.customEnum.ReturnEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class FallbackController {
    @GetMapping("/fallback")
    public ResponseEntity<String> fallback(){
        return ResponseEntity.status(ReturnEnum.FAIL.getCode()).body(ReturnEnum.FAIL.getMessage());
    }
}
