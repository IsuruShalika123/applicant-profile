package com.test.demo.repo;

import com.test.demo.Entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepo extends JpaRepository<Program, Long> {
}
