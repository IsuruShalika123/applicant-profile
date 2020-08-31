package com.test.demo.service;

import com.test.demo.Entity.RgpMedium;
import com.test.demo.repo.RgpMediumRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RgpMediumService {

    private RgpMediumRepo rgpMediumRepo;

    public RgpMediumService(RgpMediumRepo rgpMediumRepo) {
        this.rgpMediumRepo = rgpMediumRepo;
    }

    public RgpMedium create(RgpMedium rgpMedium){
        return rgpMediumRepo.save(rgpMedium);
    }

    public List<RgpMedium> get(){
        return rgpMediumRepo.findAll();
    }
}
