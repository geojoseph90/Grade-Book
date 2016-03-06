package com.gradebook.DO;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;

public class GradesXML {
	
	private List<StudentXML> student = null;

	public List<StudentXML> getGeneralStudent() {
		return student;
	}
	@XmlAnyElement(lax = true)
	public void setGeneralStudent(List<StudentXML> generalStudent) {
		this.student = generalStudent;
	}
}
