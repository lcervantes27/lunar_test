package com.moonlight.lunar_services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.lunar_services.repository.TagRepository;
import com.moonlight.lunar_services.domain.tag;

@Service
public class tagService {
	 @Autowired
    private TagRepository tagRepository;
	
	public List<tag> allTags(){
		return tagRepository.findAll();
	}
}
