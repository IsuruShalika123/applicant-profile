package com.test.demo.service;

import com.test.demo.Entity.Specialization;
import com.test.demo.repo.SpecializationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {

    private SpecializationRepo specializationRepo;

    public SpecializationService(SpecializationRepo specializationRepo) {
        this.specializationRepo = specializationRepo;
    }

    public Specialization create(Specialization specialization){
        return specializationRepo.save(specialization);
    }

    public List<Specialization> get(){
        return specializationRepo.findAll();
    }
}
