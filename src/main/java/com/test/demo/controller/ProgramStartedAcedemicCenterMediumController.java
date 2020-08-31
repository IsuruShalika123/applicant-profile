package com.test.demo.controller;

import com.test.demo.Entity.ProgramStartedAcedemicCenterMedium;
import com.test.demo.service.ProgramStartedAcedemicCenterMediumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramStartedAcedemicCenterMediumController {

    private ProgramStartedAcedemicCenterMediumService programStartedAcedemicCenterMediumService;

    public ProgramStartedAcedemicCenterMediumController(ProgramStartedAcedemicCenterMediumService programStartedAcedemicCenterMediumService) {
        this.programStartedAcedemicCenterMediumService = programStartedAcedemicCenterMediumService;
    }

    @PostMapping(path = "/program-started-acedemic-center-medium/create")
    public ProgramStartedAcedemicCenterMedium create(@RequestBody ProgramStartedAcedemicCenterMedium programStartedAcedemicCenterMedium){
        return programStartedAcedemicCenterMediumService.create(programStartedAcedemicCenterMedium);
    }

    @GetMapping(path = "/program-started-acedemic-center-medium/get")
    public List<ProgramStartedAcedemicCenterMedium> get(){
        return programStartedAcedemicCenterMediumService.get();
    }

    @GetMapping(path = "/program-started-acedemic-center-medium/get/{programStartedAcademicCenterId}")
    public List<ProgramStartedAcedemicCenterMedium> get(@PathVariable("programStartedAcademicCenterId") Long programStartedAcademicCenterId){
        return programStartedAcedemicCenterMediumService.getByProgramStartedAcademicCenterId(programStartedAcademicCenterId);
    }
}
