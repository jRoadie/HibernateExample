package com.jroadie.hibernate;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = -4447223470370323664L;
	
	private Integer id;
	private String name;
	private String studentId;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
