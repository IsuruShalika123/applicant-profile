package com.test.demo.controller;

import com.test.demo.Entity.RgmProgramSpecialization;
import com.test.demo.service.RgmProgramSpecializationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RgmProgramSpecializationController {

    private RgmProgramSpecializationService rgmProgramSpecializationService;

    public RgmProgramSpecializationController(RgmProgramSpecializationService rgmProgramSpecializationService) {
        this.rgmProgramSpecializationService = rgmProgramSpecializationService;
    }

    @PostMapping(path = "/rgm-program-specialization/create")
    public RgmProgramSpecialization create(@RequestBody  RgmProgramSpecialization rgmProgramSpecialization){
        return rgmProgramSpecializationService.create(rgmProgramSpecialization);
    }

    @GetMapping(path = "/rgm-program-specialization/get")
    public List<RgmProgramSpecialization> get(){
        return rgmProgramSpecializationService.get();
    }

    @GetMapping(path = "/rgm-program-specialization/get/{programId}")
    public List<RgmProgramSpecialization> getByProgramId(@PathVariable("programId") Long programId){
        return rgmProgramSpecializationService.getBYProgramId(programId);
    }
}
