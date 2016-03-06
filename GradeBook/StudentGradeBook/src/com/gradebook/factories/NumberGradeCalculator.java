package com.gradebook.factories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gradebook.DO.AssignedWork;
import com.gradebook.DO.GradeBook;
import com.gradebook.DO.GeneralGradeItem;
import com.gradebook.DO.GradedWork;
import com.gradebook.DO.GeneralGrades;
import com.gradebook.DO.GeneralGradingSchema;
import com.gradebook.DO.Student;

public class NumberGradeCalculator implements GradeCalculator{
	
	public static final Map<Integer,String> syllabus;
	static {
		syllabus = new HashMap<Integer,String>();
		syllabus.put(99,"A+");
		syllabus.put(95,"A");
		syllabus.put(90,"A-");
		syllabus.put(87,"B+");
		syllabus.put(84,"B");
		syllabus.put(80,"B-");
		syllabus.put(75,"C+");
		syllabus.put(70,"C");
		syllabus.put(60,"D");
	}
	
	
	public GradeBook calculateGrade(GradeBook gradeBook) {
		
	 
		GradeBook gradeBookToReturn = new GradeBook();
		gradeBookToReturn.setGeneralGradingSchema(gradeBook.getGeneralGradingSchema());
		gradeBookToReturn.setClassNumber(gradeBook.getClassNumber());
		gradeBookToReturn.setTotalAssignedWorks(gradeBook.getTotalAssignedWorks());
		List<Student> studentListToReturn = new ArrayList<Student>();
		GeneralGrades gradesToReturn = new GeneralGrades();
		GeneralGradingSchema generalGradingSchema = gradeBook.getGeneralGradingSchema();
		Map<String,Integer> gradingMap = new HashMap<String,Integer>();
		for(GeneralGradeItem gradeItem : generalGradingSchema.getGradeItemList()) {
			gradingMap.put(gradeItem.getCategory(), gradeItem.getPrecentage());
			
		}
		
		List<GeneralGradeItem> generalGradingItem = generalGradingSchema.getGradeItemList();
		GeneralGrades generalGrades = gradeBook.getGeneralGrades();
		List<Student> generalStudentList = generalGrades.getStudent();
		for(Student generalStudent : generalStudentList) {
			String finalGrade = null;
			float totalMarks = 0;
			
			
			List<AssignedWork> generalAssignedWorkList = generalStudent.getAssignedWork();
			for(AssignedWork generalAssignedWork : generalAssignedWorkList) {
				float percentage = gradingMap.get(generalAssignedWork.getCategory());
				float weight = (percentage/100); 
				float totalGrade = 0;
				for(GradedWork generalGradedWork : generalAssignedWork.getGradedWork()) {
					
					if(gradingMap.containsKey(generalAssignedWork.getCategory())) {
						
						totalGrade = totalGrade + Float.valueOf(generalGradedWork.getGrade());
						//System.out.println("Total grade is"+totalGrade);
					}
					else {
						//System.out.println("Please check the data file");
						return null;
					}
					
				}
				int sizeOfList = generalAssignedWork.getGradedWork().size();
				float weightedGrade = (totalGrade/sizeOfList)*weight;
				//System.out.println(weightedGrade);
				totalMarks += weightedGrade;
				
			}
			
			finalGrade =calculateFinalGrade(totalMarks);
			generalStudent.setLetterGrade(String.valueOf(finalGrade));
			studentListToReturn.add(generalStudent);
		}
		
		gradesToReturn.setStudent(studentListToReturn);
		gradeBookToReturn.setGeneralGrades(generalGrades);
		return gradeBookToReturn;
	
	}
	
	public String calculateFinalGrade(float totalMarks) {
		if(totalMarks >= 99) {
			return syllabus.get(99);
		}
		else if(totalMarks >= 95) {
			return syllabus.get(95);
		}
		else if(totalMarks >= 90) {
			return syllabus.get(90);
		}
		else if(totalMarks >= 87) {
			return syllabus.get(87);
		}
		else if(totalMarks >= 84) {
			return syllabus.get(84);
		}
		else if(totalMarks >= 80) {
			return syllabus.get(80);
		}
		else if(totalMarks >= 75) {
			return syllabus.get(75);
		}
		else if(totalMarks >= 70) {
			return syllabus.get(70);
		}
		else if(totalMarks >= 60) {
			return syllabus.get(60);
		}
		else {
			return "E";
		}
		
	}
	
}
