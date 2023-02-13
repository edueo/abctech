package com.edueo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/providers")
    Provider newProvider(@RequestBody Provider newProvider) {
        return repository.save(newProvider);
    }
}
