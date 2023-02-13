package com.edueo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProviderController {

    private final ProviderRepository repository;

    ProviderController(ProviderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/providers")
    List<Provider> all() {
        return repository.findAll();
    }
}
