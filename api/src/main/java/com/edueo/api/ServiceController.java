package com.edueo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    private final ServiceRepository repository;

    ServiceController(ServiceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/services")
    List<Service> all() {
        return repository.findAll();
    }

    @PostMapping("/services")
    Service newService(@RequestBody Service newService) {
        return repository.save(newService);
    }
}
