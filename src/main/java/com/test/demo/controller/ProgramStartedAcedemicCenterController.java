package com.test.demo.controller;

import com.test.demo.Entity.ProgramStartedAcedemicCenter;
import com.test.demo.service.ProgramStartedAcedemicCenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramStartedAcedemicCenterController {
    private ProgramStartedAcedemicCenterService programStartedAcedemicCenterService;

    public ProgramStartedAcedemicCenterController(ProgramStartedAcedemicCenterService programStartedAcedemicCenterService) {
        this.programStartedAcedemicCenterService = programStartedAcedemicCenterService;
    }

    @PostMapping(path = "/program-started-acedemic-center/create")
    public ProgramStartedAcedemicCenter create(@RequestBody ProgramStartedAcedemicCenter programStartedAcedemicCenter){
        return programStartedAcedemicCenterService.create(programStartedAcedemicCenter);
    }

    @GetMapping(path = "/program-started-acedemic-center/get")
    public List<ProgramStartedAcedemicCenter> get(){
        return programStartedAcedemicCenterService.get();
    }

    @GetMapping(path = "/program-started-acedemic-center/get/{programStartedId}")
    public List<ProgramStartedAcedemicCenter> getByProgramStartedId(@PathVariable("programStartedId") Long programStartedId){
        return programStartedAcedemicCenterService.getByProgramStartedId(programStartedId);
    }
}
