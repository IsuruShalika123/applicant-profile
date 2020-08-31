package com.test.demo.repo;

import com.test.demo.Entity.ProgramStartedAcedemicCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramStartedAcedemicCenterRepo extends JpaRepository<ProgramStartedAcedemicCenter, Long> {
    List<ProgramStartedAcedemicCenter> getProgramStartedAcedemicCentersByProgramstarted_Programstartedid(Long programStartedId);
}
