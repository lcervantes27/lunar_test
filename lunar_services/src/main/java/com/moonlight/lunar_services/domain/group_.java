package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class group_ {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_group;
	private String group_name;
	private String group_description;
	
	
	public Integer getId_group() {
		return id_group;
	}
	public void setId_group(Integer id_group) {
		this.id_group = id_group;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getGroup_description() {
		return group_description;
	}
	public void setGroup_description(String group_description) {
		this.group_description = group_description;
	}
	@Override
	public String toString() {
		return "group_ [id_group=" + id_group + ", group_name=" + group_name + ", group_description="
				+ group_description + "]";
	}
	
	
}
