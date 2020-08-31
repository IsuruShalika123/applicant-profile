package com.test.demo.service;

import com.test.demo.Entity.ProgramStarted;
import com.test.demo.repo.ProgramStartRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramStartedService {

    private ProgramStartRepo programStartRepo;

    public ProgramStartedService(ProgramStartRepo programStartRepo) {
        this.programStartRepo = programStartRepo;
    }

    public ProgramStarted create(ProgramStarted programStarted){
        return programStartRepo.save(programStarted);
    }

    public List<ProgramStarted> getProgramStart(){
        return programStartRepo.findAll();
    }
}
