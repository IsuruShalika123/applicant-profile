package com.test.demo.controller;

import com.test.demo.Entity.ApplicantType;
import com.test.demo.service.ApplicantTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantTypeController {

    private ApplicantTypeService applicantTypeService;

    public ApplicantTypeController(ApplicantTypeService applicantTypeService) {
        this.applicantTypeService = applicantTypeService;
    }

    @PostMapping(path = "/applicant-type/create")
    public ApplicantType create(@RequestBody ApplicantType applicantType){
        return applicantTypeService.create(applicantType);
    }

    @GetMapping(path = "/applicant-type/get")
    public List<ApplicantType> get(){
        return applicantTypeService.get();
    }
}
