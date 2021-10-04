package com.moonlight.lunar_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moonlight.lunar_services.domain.mission;

public interface MissionRepository extends JpaRepository<mission, Integer> {

}
