package com.zybe.pojo;

import com.zybe.customEnum.ReturnEnum;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ReturnData {
   private int code;
   private String message;
   private Object data;

   public ReturnData(ReturnEnum returnEnum){
      this.code =returnEnum.getCode();
      this.message=returnEnum.getMessage();
   }

   public ReturnData(int code, String message) {
      this.code =code;
      this.message=message;
   }
}
