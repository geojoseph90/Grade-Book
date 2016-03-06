package com.gradebook.DO;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class GradingSchemaXML {
	@XmlElementWrapper(name="GradingSchema")
	@XmlElement(name="GradeItem")
	private List<GradeItemXML> gradeItemList = null;

	public List<GradeItemXML> getGradeItemList() {
		return gradeItemList;
	}
	
   
    public void setGradeItemList(List<GradeItemXML> gradeItemList) {
		this.gradeItemList = gradeItemList;
	}
}
