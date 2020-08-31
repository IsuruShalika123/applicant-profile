package com.test.demo.service;

import com.test.demo.Entity.ProgramStartedAcedemicCenterMedium;
import com.test.demo.repo.ProgramStartedAcedemicCenterMediumRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramStartedAcedemicCenterMediumService {
    private ProgramStartedAcedemicCenterMediumRepo programStartedAcedemicCenterMediumRepo;

    public ProgramStartedAcedemicCenterMediumService(ProgramStartedAcedemicCenterMediumRepo programStartedAcedemicCenterMediumRepo) {
        this.programStartedAcedemicCenterMediumRepo = programStartedAcedemicCenterMediumRepo;
    }

    public ProgramStartedAcedemicCenterMedium create(ProgramStartedAcedemicCenterMedium programStartedAcedemicCenterMedium){
        return programStartedAcedemicCenterMediumRepo.save(programStartedAcedemicCenterMedium);
    }

    public List<ProgramStartedAcedemicCenterMedium> get(){
        return programStartedAcedemicCenterMediumRepo.findAll();
    }

    public List<ProgramStartedAcedemicCenterMedium> getByProgramStartedAcademicCenterId(Long programStartedAcademicCenterId){
        return programStartedAcedemicCenterMediumRepo.getProgramStartedAcedemicCenterMediumByProgramstartedacademiccenter_Programstartedacademiccenterid(programStartedAcademicCenterId);
    }
}
