package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class input_info_tag {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_input_info_tag;
	@ManyToOne
	@JoinColumn(name="id_input_info")
	private input_info input_info;	
	@ManyToOne
	@JoinColumn(name="id_tag")
	private tag tag;
	
	
	public Integer getId_input_info_tag() {
		return id_input_info_tag;
	}
	public void setId_input_info_tag(Integer id_input_info_tag) {
		this.id_input_info_tag = id_input_info_tag;
	}
	public input_info getInput_info() {
		return input_info;
	}
	public void setInput_info(input_info input_info) {
		this.input_info = input_info;
	}
	public tag getTag() {
		return tag;
	}
	public void setTag(tag tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "input_info_tag [id_input_info_tag=" + id_input_info_tag + ", input_info=" + input_info + ", tag=" + tag
				+ "]";
	}
	
}
