package com.gradebook.DO;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.*;
public class GradeBook {
	
	private String classNumber = null;
	private GeneralGradingSchema gradingSchema	= null;
	private GeneralGrades Grade = null;
	@XmlTransient
	private String generalGradeType = null;
	@XmlTransient
	private String generalOutputType = null;
	@XmlTransient
	private int totalAssignedWorks = 0;
	
	@XmlAttribute(name="class")
	public String getClassNumber() {
		return classNumber;
	}
	
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	@XmlTransient
	public GeneralGradingSchema getGeneralGradingSchema() {
		return gradingSchema;
	}
	public void setGeneralGradingSchema(GeneralGradingSchema generalGradingSchema) {
		this.gradingSchema = generalGradingSchema;
	}
	public GeneralGrades getGeneralGrades() {
		return Grade;
	}
	public void setGeneralGrades(GeneralGrades generalGrades) {
		this.Grade = generalGrades;
	}
	@XmlTransient
	public String getGeneralGradeType() {
		return generalGradeType;
	}

	public void setGeneralGradeType(String generalGradeType) {
		this.generalGradeType = generalGradeType;
	}
	@XmlTransient
	public String getGeneralOutputType() {
		return generalOutputType;
	}

	public void setGeneralOutputType(String generalOutputType) {
		this.generalOutputType = generalOutputType;
	}
	@XmlTransient
	public int getTotalAssignedWorks() {
		return totalAssignedWorks;
	}

	public void setTotalAssignedWorks(int totalAssignedWorks) {
		this.totalAssignedWorks = totalAssignedWorks;
	}
	
	
}
