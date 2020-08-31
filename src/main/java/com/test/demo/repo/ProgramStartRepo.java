package com.test.demo.repo;

import com.test.demo.Entity.ProgramStarted;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramStartRepo extends JpaRepository<ProgramStarted, Long> {
}
