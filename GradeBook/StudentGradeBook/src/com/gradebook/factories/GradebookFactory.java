package com.gradebook.factories;

import com.gradebook.DO.GradeBook;

public abstract class GradebookFactory {
	//public GradebookFactory getGradebookFactory();
	//public boolean generateGradebook();
	//public abstract String createGradebook();
	public abstract GradeBook readGrades(String fileType);
	public abstract GradeBook calcuateGrades(GradeBook gradeBook);
	public abstract String generateGradebook(GradeBook gradeBook);
}
