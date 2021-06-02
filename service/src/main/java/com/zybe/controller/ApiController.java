package com.zybe.controller;

import com.zybe.customEnum.ReturnEnum;
import com.zybe.pojo.Lift;
import com.zybe.pojo.ReturnData;
import com.zybe.pojo.Tower;
import com.zybe.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("tower")
    public ReturnData tower(){
        List<Tower> tower = apiService.tower();
        return new ReturnData(ReturnEnum.SUCCESS,tower);
    }

    @GetMapping("lift")
    public ReturnData lift(){
        List<Lift> lift = apiService.lift();
        return new ReturnData(ReturnEnum.SUCCESS,lift);
    }

    @PostMapping("tower")
    public ReturnData tower(@RequestBody @Valid Tower tower){
        apiService.tower(tower);
        return new ReturnData(ReturnEnum.SUCCESS);
    }

    @PostMapping("lift")
    public ReturnData lift(@RequestBody @Valid Lift lift)
    {
        apiService.lift(lift);
        return new ReturnData(ReturnEnum.SUCCESS);
    }

}
