package com.zybe.exception;

import com.zybe.customEnum.ReturnEnum;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private int code;

    public CustomException(ReturnEnum returnEnum){
        super(returnEnum.getMessage());
        this.code= returnEnum.getCode();
    }
}
