package com.test.demo.repo;

import com.test.demo.Entity.InitialApplicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitialApplicantRepo extends JpaRepository<InitialApplicant, Long> {
}
