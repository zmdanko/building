package com.zybe.exception;

import com.zybe.customEnum.ReturnEnum;
import lombok.Getter;

@Getter
public class ArgsException extends RuntimeException{
    private int code;

    public ArgsException(ReturnEnum returnEnum){
        super(returnEnum.getMessage());
        this.code= returnEnum.getCode();
    }
}
