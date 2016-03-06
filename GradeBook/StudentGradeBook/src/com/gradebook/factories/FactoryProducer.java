package com.gradebook.factories;

public class FactoryProducer {
	public GradebookFactory getFactory(String studentType) {
		if(studentType.trim().equalsIgnoreCase("graduate")) {
			return new GraduateGradebookFactory();
		}
		else if(studentType.trim().equalsIgnoreCase("undergraduate")) {
			return new UndergraduateGradebookFactory();
		}
		else {
			return null;
		}
	}
}
