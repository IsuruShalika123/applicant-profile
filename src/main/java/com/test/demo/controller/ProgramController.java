package com.test.demo.controller;

import com.test.demo.Entity.Program;
import com.test.demo.service.ProgramService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {

    private ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @PostMapping(path = "/program/create")
    public Program createProgram(@RequestBody Program program){
        return programService.createProgram(program);
    }

    @GetMapping(path = "/program/get")
    public List<Program> get(){
        return programService.get();
    }
}
