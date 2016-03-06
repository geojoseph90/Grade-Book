package com.gradebook.DO;

import java.util.List;

public class GeneralGradingSchema {
	private List<GeneralGradeItem> gradeItemList = null;

	public List<GeneralGradeItem> getGradeItemList() {
		return gradeItemList;
	}

	public void setGradeItemList(List<GeneralGradeItem> gradeItemList) {
		this.gradeItemList = gradeItemList;
	}
}
