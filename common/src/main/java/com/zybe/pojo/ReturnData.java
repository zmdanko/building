package com.zybe.pojo;

import com.zybe.customEnum.ReturnEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class ReturnData<T> {
   private int code;
   private String message;
   private T data;

   public ReturnData(ReturnEnum returnEnum){
      this.code =returnEnum.getCode();
      this.message=returnEnum.getMessage();
   }

   public ReturnData(ReturnEnum returnEnum,T data){
      this.code =returnEnum.getCode();
      this.message=returnEnum.getMessage();
      this.data=data;
   }

   public ReturnData(int code, String message) {
      this.code =code;
      this.message=message;
   }
}
