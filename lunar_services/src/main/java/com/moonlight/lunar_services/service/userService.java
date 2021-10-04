package com.moonlight.lunar_services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.lunar_services.domain.user_;
import com.moonlight.lunar_services.repository.UserRepository;

@Service
public class userService {
	@Autowired
    private UserRepository userRepository;
	
	public List <user_> allUser(){
		return userRepository.findAll();
	}
}
