package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class mission {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_mission;
	private String mission_name;
	private String mission_description;
	
	
	public Integer getId_mission() {
		return id_mission;
	}
	public void setId_mission(Integer id_mission) {
		this.id_mission = id_mission;
	}
	public String getMission_name() {
		return mission_name;
	}
	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}
	public String getMission_description() {
		return mission_description;
	}
	public void setMission_description(String mission_description) {
		this.mission_description = mission_description;
	}
	@Override
	public String toString() {
		return "mission [id_mission=" + id_mission + ", mission_name=" + mission_name + ", mission_description="
				+ mission_description + "]";
	}
	
}