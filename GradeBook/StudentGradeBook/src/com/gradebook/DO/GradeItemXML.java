package com.gradebook.DO;

import javax.xml.bind.annotation.XmlElement;

public class GradeItemXML {
	@XmlElement(name = "Category", required = true)
	private String 	Category 		= null;
	@XmlElement(name = "Percentage", required = true)
	private int		Percentage		= 0;
	
	public String getCategory() {
		return Category;
	}
	
	
	public void setCategory(String category) {
		this.Category = category;
	}
	
	public int getPrecentage() {
		return Percentage;
	}
	
	public void setPrecentage(int percentage) {
		this.Percentage = percentage;
	}
}
