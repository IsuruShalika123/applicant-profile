package com.test.demo.service;

import com.test.demo.Entity.RgmProgramSpecialization;
import com.test.demo.repo.RgmProgramSpecializationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RgmProgramSpecializationService {
    private RgmProgramSpecializationRepo rgmProgramSpecializationRepo;

    public RgmProgramSpecializationService(RgmProgramSpecializationRepo rgmProgramSpecializationRepo) {
        this.rgmProgramSpecializationRepo = rgmProgramSpecializationRepo;
    }

    public RgmProgramSpecialization create(RgmProgramSpecialization rgmProgramSpecialization){
        return rgmProgramSpecializationRepo.save(rgmProgramSpecialization);
    }

    public List<RgmProgramSpecialization> get(){
        return rgmProgramSpecializationRepo.findAll();
    }

    public List<RgmProgramSpecialization> getBYProgramId(Long programId){
        return rgmProgramSpecializationRepo.getRgmProgramSpecializationsByProgram_Programid(programId);
    }
}
