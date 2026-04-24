package com.health.service;

import com.health.model.PatientLog;
import com.health.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repo;

    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    public PatientLog save(PatientLog log) {
        return repo.save(log);
    }

    public List<PatientLog> getAll() {
        return repo.findAll();
    }
}
