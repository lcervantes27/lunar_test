package com.moonlight.lunar_services.model;

public class file_request {
	private String file_name;
	private String value;
	private String type;
	
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "file_request [file_name=" + file_name + ", value=" + value + ", type=" + type + "]";
	}
	
}
