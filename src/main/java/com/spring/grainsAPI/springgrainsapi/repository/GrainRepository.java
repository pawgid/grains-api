package com.spring.grainsAPI.springgrainsapi.repository;

import com.spring.grainsAPI.springgrainsapi.model.Grain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrainRepository extends JpaRepository<Grain, String> {
}
