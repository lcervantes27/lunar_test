package com.moonlight.lunar_services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.lunar_services.repository.MissionRepository;
import com.moonlight.lunar_services.domain.mission;

@Service
public class missionService {
	@Autowired
	private MissionRepository missionRepository;
	
	public List<mission> allMissions(){
		return missionRepository.findAll();
	}
}
