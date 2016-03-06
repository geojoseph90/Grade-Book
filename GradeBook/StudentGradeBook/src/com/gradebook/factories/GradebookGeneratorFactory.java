package com.gradebook.factories;

public class GradebookGeneratorFactory {
	public GradebookGenerator generateGradeGenerator(String outputType) {
		
		if(outputType.equals("html")) {
			return new HTMLGradebookGenerator();
		} else if (outputType.equals("csv")){
			
			return new CSVGradebookGenerator();
		}
		else if(outputType.equals("xml")){
			return new XMLGradebookGenerator();
		}
		else {
			return null;
		}
	
	}
}
