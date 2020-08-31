package com.test.demo.repo;

import com.test.demo.Entity.ProgramStartedAcedemicCenterMedium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramStartedAcedemicCenterMediumRepo extends JpaRepository<ProgramStartedAcedemicCenterMedium, Long> {

    List<ProgramStartedAcedemicCenterMedium> getProgramStartedAcedemicCenterMediumByProgramstartedacademiccenter_Programstartedacademiccenterid(Long programstartedacademiccenterid);
}
