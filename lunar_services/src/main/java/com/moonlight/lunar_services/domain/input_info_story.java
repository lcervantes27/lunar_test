package com.moonlight.lunar_services.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class input_info_story {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_input_info_story;
	@ManyToOne
	@JoinColumn(name="id_input_info")
	private input_info input_info;
	@ManyToOne
	@JoinColumn(name="id_privacy_status")
	private privacy_status privacy_status;
	private String title;
	private String description;
	private LocalDateTime update_time;
	
	
	public Integer getId_input_info_story() {
		return id_input_info_story;
	}
	public void setId_input_info_story(Integer id_input_info_story) {
		this.id_input_info_story = id_input_info_story;
	}
	public input_info getInput_info() {
		return input_info;
	}
	public void setInput_info(input_info input_info) {
		this.input_info = input_info;
	}
	public privacy_status getPrivacy_status() {
		return privacy_status;
	}
	public void setPrivacy_status(privacy_status privacy_status) {
		this.privacy_status = privacy_status;
	}
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
	public LocalDateTime getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(LocalDateTime update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "input_info_story [id_input_info_story=" + id_input_info_story + ", input_info=" + input_info
				+ ", privacy_status=" + privacy_status + ", title=" + title + ", description=" + description
				+ ", update_time=" + update_time + "]";
	}
	
}