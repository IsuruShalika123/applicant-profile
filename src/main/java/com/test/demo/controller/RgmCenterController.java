package com.test.demo.controller;

import com.test.demo.Entity.RgmCenter;
import com.test.demo.service.RgmCenterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RgmCenterController {
    private RgmCenterService rgmCenterService;

    public RgmCenterController(RgmCenterService rgmCenterService) {
        this.rgmCenterService = rgmCenterService;
    }

    @PostMapping(path = "/rgm-center/create")
    public RgmCenter create(@RequestBody RgmCenter rgmCenter){
        return rgmCenterService.create(rgmCenter);
    }

    @GetMapping(path = "/rgm-center/get")
    public List<RgmCenter> get(){
        return rgmCenterService.get();
    }
}
