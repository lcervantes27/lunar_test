package com.moonlight.lunar_services.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.lunar_services.domain.input_files;
import com.moonlight.lunar_services.domain.input_info;
import com.moonlight.lunar_services.domain.input_info_tag;
import com.moonlight.lunar_services.domain.user_;
import com.moonlight.lunar_services.domain.privacy_status;
import com.moonlight.lunar_services.domain.tag;
import com.moonlight.lunar_services.model.creation_response;
import com.moonlight.lunar_services.model.file_request;
import com.moonlight.lunar_services.model.input_request;
import com.moonlight.lunar_services.repository.InputFilesRepository;
import com.moonlight.lunar_services.repository.InputInfoRepository;
import com.moonlight.lunar_services.repository.InputInfoStoryRepository;
import com.moonlight.lunar_services.repository.InputInfoTagRepository;
import com.moonlight.lunar_services.repository.PrivacyStatusRepository;
import com.moonlight.lunar_services.repository.TagRepository;
import com.moonlight.lunar_services.repository.UserRepository;

@Service
public class inputInfoService {
	@Autowired
	private InputInfoRepository inputInfoRepository;
	@Autowired
	private InputFilesRepository inputFilesRepository;
	@Autowired
	private InputInfoStoryRepository inputInfoStoryRepository;
	@Autowired
	private InputInfoTagRepository inputInfoTagRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PrivacyStatusRepository privacyRepository;
	@Autowired
	private TagRepository tagRepository;
	@Autowired
	private InputInfoTagRepository inputTagRepository;
	@Autowired
	private InputFilesRepository inputFileRepository;
	
	public creation_response newInputInfo(input_request request) {
		System.out.println("REQUEST: "+request);
		creation_response response = new creation_response();
		if(!userRepository.existsById(request.getId_user())) {
			response.setMessage("User not found");
			return response;
		}
		try {
			user_ info_user = userRepository.getById(request.getId_user());
			privacy_status info_privacy = privacyRepository.getById(request.getId_user());
			input_info newInput = new input_info();
			newInput.setTitle(request.getTitle());
			newInput.setDescription(request.getDescription());
			newInput.setPrivacy_status(info_privacy);
			newInput.setUser_(info_user);
			newInput.setCreation_time(LocalDateTime.now());
			inputInfoRepository.save(newInput);
			response.setMessage("Record created");
			if(request.getTags().size()>0) {
				addTags(request.getTags(),newInput);
			}
			if(request.getFiles().size()>0) {
				addFiles(request.getFiles(),newInput);
			}
		}
		catch(Exception e) {
			response.setMessage("Unexpected error");
			System.out.println("Error on saving input: "+e.getMessage());
		}
		return response;
	}
	
	public void addTags(List<Integer> tagIds, input_info input) {
		tagIds.stream().forEach((tagId)-> {
			try {
				tag foundTag = tagRepository.getById(tagId);
				input_info_tag relatedTag = new input_info_tag();
				relatedTag.setInput_info(input);
				relatedTag.setTag(foundTag);
				inputTagRepository.save(relatedTag);
			}
			catch(Exception e) {
				System.out.println("Error on add tags: "+e.getMessage());
			}
			
		});
	}
	
	public void addFiles(List<file_request> files, input_info input) {
		files.stream().forEach((file)-> {
			try {
				input_files relatedFile = new input_files();
				relatedFile.setInput_info(input);
				relatedFile.setFile_name(file.getFile_name());
				relatedFile.setValue_(file.getValue());
				relatedFile.setType_(file.getType());
				inputFileRepository.save(relatedFile);
			}
			catch(Exception e) {
				System.out.println("Error on add files: "+e.getMessage());
			}
			
		});
	}
	
	public List<input_info> allInputs(){
		return inputInfoRepository.findAll();
	}
}
