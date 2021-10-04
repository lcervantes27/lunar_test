package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class privacy_status {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_privacy_status;
	private String privacy_name;
	@ManyToOne
	@JoinColumn(name="id_group")
	private group_ group_;
	
	public Integer getId_privacy_status() {
		return id_privacy_status;
	}
	public void setId_privacy_status(Integer id_privacy_status) {
		this.id_privacy_status = id_privacy_status;
	}
	public String getPrivacy_name() {
		return privacy_name;
	}
	public void setPrivacy_name(String privacy_name) {
		this.privacy_name = privacy_name;
	}
	public group_ getGroup_() {
		return group_;
	}
	public void setGroup_(group_ group_) {
		this.group_ = group_;
	}
	@Override
	public String toString() {
		return "privacy_status [id_privacy_status=" + id_privacy_status + ", privacy_name=" + privacy_name + ", group_="
				+ group_ + "]";
	}
}
