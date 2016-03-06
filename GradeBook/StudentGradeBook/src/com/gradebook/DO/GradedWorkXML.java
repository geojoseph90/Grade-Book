package com.gradebook.DO;

import javax.xml.bind.annotation.XmlElement;

public class GradedWorkXML {
	
	private String name = null;
	
	private String grade = null;
	public String getName() {
		return name;
	}
	@XmlElement(name = "Name", required = true)
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	@XmlElement(name = "Grade", required = true)
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
