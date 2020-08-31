package com.test.demo.controller;

import com.test.demo.Entity.ProgramStarted;
import com.test.demo.service.ProgramStartedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramStartController {

    private ProgramStartedService programStartedService;

    public ProgramStartController(ProgramStartedService programStartedService) {
        this.programStartedService = programStartedService;
    }

    @PostMapping(path = "/program-start/create")
    public ProgramStarted createProgramStart(@RequestBody ProgramStarted programStarted){
        return programStartedService.create(programStarted);
    }

    @GetMapping(path = "/program-start/get")
    public List<ProgramStarted> getProgramStart(){
        return programStartedService.getProgramStart();
    }
}
