package com.health.controller;

import com.health.model.PatientLog;
import com.health.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public PatientLog add(@RequestBody PatientLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<PatientLog> getAll() {
        return service.getAll();
    }
}
