package com.test.demo.controller;

import com.test.demo.Entity.RgpMedium;
import com.test.demo.service.RgpMediumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RgpMediumController {
    private RgpMediumService rgpMediumService;

    public RgpMediumController(RgpMediumService rgpMediumService) {
        this.rgpMediumService = rgpMediumService;
    }

    @PostMapping(path = "/rgp-medium/create")
    public RgpMedium create(@RequestBody RgpMedium rgpMedium){
        return rgpMediumService.create(rgpMedium);
    }

    @GetMapping(path = "/rgp-medium/get")
    public List<RgpMedium> get(){
        return rgpMediumService.get();
    }
}
