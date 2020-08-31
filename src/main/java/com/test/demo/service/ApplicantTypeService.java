package com.test.demo.service;

import com.test.demo.Entity.ApplicantType;
import com.test.demo.repo.ApplicantTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantTypeService {

    private ApplicantTypeRepo applicantTypeRepo;

    public ApplicantTypeService(ApplicantTypeRepo applicantTypeRepo) {
        this.applicantTypeRepo = applicantTypeRepo;
    }

    public ApplicantType create(ApplicantType applicantType){
        return applicantTypeRepo.save(applicantType);
    }

    public List<ApplicantType> get(){
        return applicantTypeRepo.findAll();
    }
}
