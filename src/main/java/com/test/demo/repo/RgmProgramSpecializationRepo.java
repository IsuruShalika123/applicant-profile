package com.test.demo.repo;

import com.test.demo.Entity.RgmProgramSpecialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RgmProgramSpecializationRepo extends JpaRepository<RgmProgramSpecialization, Long> {
    List<RgmProgramSpecialization> getRgmProgramSpecializationsByProgram_Programid(Long programId);
}
