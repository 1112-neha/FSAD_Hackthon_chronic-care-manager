package com.health.repository;

import com.health.model.PatientLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientLog, Long> {
}
