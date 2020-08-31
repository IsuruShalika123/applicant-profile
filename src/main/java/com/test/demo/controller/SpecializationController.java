package com.test.demo.controller;

import com.test.demo.Entity.Specialization;
import com.test.demo.service.SpecializationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpecializationController {
    private SpecializationService specializationService;

    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @PostMapping(path = "/specialization/create")
    public Specialization create(@RequestBody Specialization specialization){
        return specializationService.create(specialization);
    }

    @GetMapping(path = "/specialization/get")
    public List<Specialization> get(){
        return specializationService.get();
    }
}
