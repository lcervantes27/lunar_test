package com.moonlight.lunar_services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user_ {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_user;
	private String user_;
	private String pass;
	private String role_;
	private String console;
	private String seat;
	private String real_name;
	
	public Integer getId_user() {
		return id_user;
	}
	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	public String getUser_() {
		return user_;
	}
	public void setUser_(String user_) {
		this.user_ = user_;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole_() {
		return role_;
	}
	public void setRole_(String role_) {
		this.role_ = role_;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	@Override
	public String toString() {
		return "user_ [id_user=" + id_user + ", user_=" + user_ + ", pass=" + pass + ", role_=" + role_ + ", console="
				+ console + ", seat=" + seat + ", real_name=" + real_name + "]";
	}
	
	
	
}
