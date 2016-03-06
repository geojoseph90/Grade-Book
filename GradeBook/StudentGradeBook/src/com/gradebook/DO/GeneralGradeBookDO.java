package com.gradebook.DO;

import java.util.List;

public class GeneralGradeBookDO {
	private List<GeneralGradeItem> gradeItemList = null;
	private List<GeneralGrades> gradesList 		 = null;
	public List<GeneralGradeItem> getGradeItemList() {
		return gradeItemList;
	}
	public void setGradeItemList(List<GeneralGradeItem> gradeItemList) {
		this.gradeItemList = gradeItemList;
	}
	public List<GeneralGrades> getGradesList() {
		return gradesList;
	}
	public void setGradesList(List<GeneralGrades> gradesList) {
		this.gradesList = gradesList;
	}
}
