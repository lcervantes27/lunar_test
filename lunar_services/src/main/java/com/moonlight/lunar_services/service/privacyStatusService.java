package com.moonlight.lunar_services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.lunar_services.repository.TagRepository;
import com.moonlight.lunar_services.domain.privacy_status;
import com.moonlight.lunar_services.repository.PrivacyStatusRepository;

@Service
public class privacyStatusService {
	@Autowired
	private PrivacyStatusRepository privRepository;
	
	public List<privacy_status> allStatus(){
		return privRepository.findAll();
	}
}
