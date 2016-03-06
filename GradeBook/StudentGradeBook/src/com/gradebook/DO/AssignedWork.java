package com.gradebook.DO;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class AssignedWork {
	
	private String category = null;
	private List<GradedWork> gradedWork = null;
	@XmlAttribute(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<GradedWork> getGradedWork() {
		return gradedWork;
	}
	public void setGradedWork(List<GradedWork> generalGradedWork) {
		
		this.gradedWork = generalGradedWork;
	}
	
	
}
