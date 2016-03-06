package com.gradebook.DO;

public class PrintableDO {
	String Name;
	String ID;
	String Category;
	String Work;
	String Grade;
	String ClassNo;
	public String getName() {
		return Name;
	}
	public void setStudentName(String studentName) {
		this.Name = studentName;
	}
	public String getID() {
		return ID;
	}
	public void setStudentId(String studentId) {
		this.ID = studentId;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public String getWork() {
		return Work;
	}
	public void setGradedWork(String gradedWork) {
		this.Work = gradedWork;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		this.Grade = grade;
	}
	public String getClassNo() {
		return ClassNo;
	}
	public void setClassNumber(String classNumber) {
		this.ClassNo = classNumber;
	}
	
}
