package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "School")
public class Test_image {
	@Id
	int s_id;
	String s_name;
	@Column(columnDefinition = "LONGBLOB" )
	byte[] s_img;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public byte[] getS_img() {
		return s_img;
	}
	public void setS_img(byte[] s_img) {
		this.s_img = s_img;
	}
	
	
	
}
