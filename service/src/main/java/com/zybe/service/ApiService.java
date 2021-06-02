package com.zybe.service;

import com.zybe.mapper.LiftMapper;
import com.zybe.mapper.TowerMapper;
import com.zybe.pojo.Lift;
import com.zybe.pojo.Tower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    @Autowired
    private LiftMapper liftMapper;

    @Autowired
    private TowerMapper towerMapper;

    public void tower(Tower tower) {
        towerMapper.insertSelective(tower);
    }

    public void lift(Lift lift) {
        liftMapper.insertSelective(lift);
    }

    public List<Tower> tower() {
       return towerMapper.selectAll();
    }

    public List<Lift> lift() {
        return liftMapper.selectAll();
    }
}
