package com.zybe.controller;

import com.zybe.customEnum.ReturnEnum;
import com.zybe.pojo.Lift;
import com.zybe.pojo.ReturnData;
import com.zybe.pojo.Tower;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api")
public class ApiController {
    @PostMapping("tower")
    public ReturnData tower(@Valid Tower tower){
        return new ReturnData(ReturnEnum.SUCCESS);
    }

    @PostMapping("lift")
    public ReturnData lift(@Valid Lift lift){
        return new ReturnData(ReturnEnum.SUCCESS);
    }

}
