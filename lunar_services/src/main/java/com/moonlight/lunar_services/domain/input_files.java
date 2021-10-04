package com.moonlight.lunar_services.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class input_files {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_input_files;
	@ManyToOne
	@JoinColumn(name="id_input_info")
	private input_info input_info;
	private String file_name;
	private String value_;
	private String type_;
	private LocalDateTime creation_time;

	
	public Integer getId_input_files() {
		return id_input_files;
	}
	public void setId_input_files(Integer id_input_files) {
		this.id_input_files = id_input_files;
	}
	public input_info getInput_info() {
		return input_info;
	}
	public void setInput_info(input_info input_info) {
		this.input_info = input_info;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getValue_() {
		return value_;
	}
	public void setValue_(String value_) {
		this.value_ = value_;
	}
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public LocalDateTime getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(LocalDateTime creation_time) {
		this.creation_time = creation_time;
	}
	@Override
	public String toString() {
		return "input_files [id_input_files=" + id_input_files + ", input_info=" + input_info + ", file_name="
				+ file_name + ", value_=" + value_ + ", type_=" + type_ + ", creation_time=" + creation_time + "]";
	}
	
}
