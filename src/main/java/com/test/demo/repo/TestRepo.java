package com.test.demo.repo;

import com.test.demo.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long> {
}
