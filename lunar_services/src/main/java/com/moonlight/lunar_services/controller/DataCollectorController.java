package com.moonlight.lunar_services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.lunar_services.domain.input_info;
import com.moonlight.lunar_services.domain.mission;
import com.moonlight.lunar_services.domain.privacy_status;
import com.moonlight.lunar_services.domain.tag;
import com.moonlight.lunar_services.domain.user_;
import com.moonlight.lunar_services.model.creation_response;
import com.moonlight.lunar_services.model.input_request;
import com.moonlight.lunar_services.service.inputInfoService;
import com.moonlight.lunar_services.service.missionService;
import com.moonlight.lunar_services.service.privacyStatusService;
import com.moonlight.lunar_services.service.tagService;
import com.moonlight.lunar_services.service.userService;

@RestController
public class DataCollectorController {
	
	@Autowired
    private tagService tag_serv;
	
	@Autowired
    private missionService mission_serv;
	
	@Autowired
    private privacyStatusService privacy_serv;
	
	@Autowired
    private inputInfoService input_info_serv;
	
	@Autowired
    private userService user_serv;
	
	@GetMapping("/tags")
	  List<tag> allTags() {
	    return tag_serv.allTags();
	}
	@GetMapping("/missions")
	  List<mission> allMissions() {
	    return mission_serv.allMissions();
	}
	@GetMapping("/privacy")
	  List<privacy_status> allPrivStatus() {
	    return privacy_serv.allStatus();
	}
	 @PostMapping("/info_input")
	 creation_response newInputInfo(@RequestBody input_request request) {
	    return input_info_serv.newInputInfo(request);
	 }
	 @GetMapping("/entries")
	  List<input_info> allEntries() {
	    return input_info_serv.allInputs();
	}
	 @GetMapping("/users")
	  List<user_> allUser() {
	    return user_serv.allUser();
	}
}
