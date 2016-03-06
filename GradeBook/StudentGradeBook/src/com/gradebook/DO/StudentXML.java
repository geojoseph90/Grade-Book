package com.gradebook.DO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class StudentXML {
	
	private String name = null;
	
	private String id = null;
	
	
	public String getStudentName() {
		return name;
	}
	
	@XmlElement(name = "Name", required = true)
	public void setStudentName(String studentName) {
		this.name = studentName;
	}
	
	public String getStudentId() {
		return id;
	}
	@XmlElement(name = "ID", required = true)
	public void setStudentId(String studentId) {
		this.id = studentId;
	}
	
	//@XmlElementWrapper(name="Student")
	@XmlElement(name="AssignedWork")
	private List<AssignedWorkXML> assignedWork = null;
	public List<AssignedWorkXML> getGeneralAssignedWork() {
		return assignedWork;
	}
	
	public void setGeneralAssignedWork(List<AssignedWorkXML> generalAssignedWork) {
		this.assignedWork = generalAssignedWork;
	}
}
