package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tag {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_tag;
	private String tag_name;
	
	public Integer getId_tag() {
		return id_tag;
	}
	public void setId_tag(Integer id_tag) {
		this.id_tag = id_tag;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	@Override
	public String toString() {
		return "tag [id_tag=" + id_tag + ", tag_name=" + tag_name + "]";
	}

}
