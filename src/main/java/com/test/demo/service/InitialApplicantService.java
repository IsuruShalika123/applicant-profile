package com.test.demo.service;

import com.test.demo.Entity.InitialApplicant;
import com.test.demo.repo.InitialApplicantRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitialApplicantService {

    private InitialApplicantRepo initialApplicantRepo;

    public InitialApplicantService(InitialApplicantRepo initialApplicantRepo) {
        this.initialApplicantRepo = initialApplicantRepo;
    }

    public InitialApplicant create(InitialApplicant initialApplicant){
        return initialApplicantRepo.save(initialApplicant);
    }

    public List<InitialApplicant> get(){
        return initialApplicantRepo.findAll();
    }
}
