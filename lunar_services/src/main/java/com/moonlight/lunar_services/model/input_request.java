package com.moonlight.lunar_services.model;

import java.util.List;

public class input_request {
	private String title;
	private String description; 
	private Integer id_user;
	private Integer id_privacy_status;
	private List<Integer> tags;
	private List<file_request> files;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId_user() {
		return id_user;
	}
	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	public Integer getId_privacy_status() {
		return id_privacy_status;
	}
	public void setId_privacy_status(Integer id_privacy_status) {
		this.id_privacy_status = id_privacy_status;
	}
	
	public List<file_request> getFiles() {
		return files;
	}
	public void setFiles(List<file_request> files) {
		this.files = files;
	}
	public List<Integer> getTags() {
		return tags;
	}
	public void setTags(List<Integer> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "input_request [title=" + title + ", description=" + description + ", id_user=" + id_user
				+ ", id_privacy_status=" + id_privacy_status + ", tags=" + tags + ", files=" + files + "]";
	}
}
