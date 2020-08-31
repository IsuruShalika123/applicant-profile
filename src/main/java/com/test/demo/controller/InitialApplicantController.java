package com.test.demo.controller;

import com.test.demo.Entity.InitialApplicant;
import com.test.demo.service.InitialApplicantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InitialApplicantController {

    private InitialApplicantService initialApplicantService;

    public InitialApplicantController(InitialApplicantService initialApplicantService) {
        this.initialApplicantService = initialApplicantService;
    }

    @PostMapping(path = "/initial-applicant/create")
    public InitialApplicant create(@RequestBody InitialApplicant initialApplicant){
        return initialApplicantService.create(initialApplicant);
    }

    @GetMapping(path = "/initial-applicant/get")
    public List<InitialApplicant> get(){
        return initialApplicantService.get();
    }
}
