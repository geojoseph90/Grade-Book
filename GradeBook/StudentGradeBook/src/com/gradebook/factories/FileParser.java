package com.gradebook.factories;

import com.gradebook.DO.GradeBook;

public interface FileParser {
	public GradeBook parseFile(String fileLocation);
}
