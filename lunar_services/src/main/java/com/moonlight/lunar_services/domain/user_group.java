package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class user_group {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="id_user")
	private user_ user_;
	@ManyToOne
	@JoinColumn(name="id_group")
	private group_ group_;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public user_ getUser_() {
		return user_;
	}
	public void setUser_(user_ user_) {
		this.user_ = user_;
	}
	public group_ getGroup() {
		return group_;
	}
	public void setGroup(group_ group) {
		this.group_ = group;
	}
	@Override
	public String toString() {
		return "user_group [id=" + id + ", user_=" + user_ + ", group=" + group_ + "]";
	}
}
