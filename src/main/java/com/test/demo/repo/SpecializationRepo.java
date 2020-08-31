package com.test.demo.repo;

import com.test.demo.Entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepo extends JpaRepository<Specialization, Long> {
}
