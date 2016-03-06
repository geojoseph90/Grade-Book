package com.gradebook.factories;

public class GradeCalculatorFactory {
	public GradeCalculator getGradeCalculator(String gradeType) {
		if(gradeType.trim().equals("Letter")) {
			return new LetterGradeCalculator();
		}
		else if(gradeType.trim().equals("Number")) {
			return new NumberGradeCalculator();
		}
		else {
			return null;
		}
	}
	
}
