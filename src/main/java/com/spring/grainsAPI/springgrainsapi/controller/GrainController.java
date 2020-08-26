package com.spring.grainsAPI.springgrainsapi.controller;

import com.spring.grainsAPI.springgrainsapi.model.Grain;
import com.spring.grainsAPI.springgrainsapi.repository.GrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grain")
public class GrainController {

    @Autowired
    private GrainRepository grainRepository;

    @GetMapping("/allgrains")
    public List<Grain> getAllGrains() {
        return grainRepository.findAll();
    }

    @GetMapping("/findbyname/{name}")
    public String hello(@PathVariable String name) {
        return "Hello from GET " + name;
    }
}
