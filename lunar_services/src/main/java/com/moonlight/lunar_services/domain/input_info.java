package com.moonlight.lunar_services.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class input_info {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_input_info;
	@ManyToOne
	@JoinColumn(name="id_user")
	private user_ user_;
	@ManyToOne
	@JoinColumn(name="id_privacy_status")
	private privacy_status privacy_status;
	private String title;
	private String description;
	private LocalDateTime creation_time;
	private LocalDateTime publish_time;
	private LocalDateTime update_time;

	
	public Integer getId_input_info() {
		return id_input_info;
	}
	public void setId_input_info(Integer id_input_info) {
		this.id_input_info = id_input_info;
	}
	public user_ getUser_() {
		return user_;
	}
	public void setUser_(user_ user_) {
		this.user_ = user_;
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
	public LocalDateTime getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(LocalDateTime creation_time) {
		this.creation_time = creation_time;
	}
	public LocalDateTime getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(LocalDateTime publish_time) {
		this.publish_time = publish_time;
	}
	public LocalDateTime getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(LocalDateTime update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "input_info [id_input_info=" + id_input_info + ", user_=" + user_ + ", privacy_status=" + privacy_status
				+ ", title=" + title + ", description=" + description + ", creation_time=" + creation_time
				+ ", publish_time=" + publish_time + ", update_time=" + update_time + "]";
	}
	
}