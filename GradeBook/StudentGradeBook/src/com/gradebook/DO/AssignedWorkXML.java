package com.gradebook.DO;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class AssignedWorkXML {
	
	private String category = null;
	
	
	public String getCategory() {
		return category;
	}
	@XmlAttribute(name = "category", required = true)
	public void setCategory(String category) {
		this.category = category;
	}
	//@XmlElementWrapper(name="AssignedWork")
	@XmlElement(name="GradedWork")
	private List<GradedWorkXML> gradedWork = null;
	public List<GradedWorkXML> getGeneralGradedWork() {
		return gradedWork;
	}
	
	public void setGeneralGradedWork(List<GradedWorkXML> generalGradedWork) {
		this.gradedWork = generalGradedWork;
	}
}
