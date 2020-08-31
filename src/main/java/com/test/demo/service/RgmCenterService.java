package com.test.demo.service;

import com.test.demo.Entity.RgmCenter;
import com.test.demo.repo.RgmCenterRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RgmCenterService {

    private RgmCenterRepo rgmCenterRepo;

    public RgmCenterService(RgmCenterRepo rgmCenterRepo) {
        this.rgmCenterRepo = rgmCenterRepo;
    }

    public RgmCenter create(RgmCenter rgmCenter){
        return rgmCenterRepo.save(rgmCenter);
    }

    public List<RgmCenter> get(){
        return rgmCenterRepo.findAll();
    }
}
