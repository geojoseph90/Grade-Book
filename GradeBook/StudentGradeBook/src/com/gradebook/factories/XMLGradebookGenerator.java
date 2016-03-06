package com.gradebook.factories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.gradebook.DO.GradeBook;

public class XMLGradebookGenerator implements GradebookGenerator{
	@Override
	public boolean generateGradebook(GradeBook generalGradeBook) {
		 String userHomeFolder = System.getProperty("user.home");	
		 String fileName = "/Desktop/GradeBook.xml";
		 
		
		 JAXBContext jc;
		 FileOutputStream fo = null;
		 try {
			fo = new FileOutputStream(new File(userHomeFolder.concat(fileName)),false);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		try {
			jc = JAXBContext.newInstance(GradeBook.class);
			Marshaller marshaller = jc.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    JAXBElement<GradeBook> rootElement = new JAXBElement<GradeBook>(new QName("GradeBook"), GradeBook.class, generalGradeBook);
		    marshaller.marshal(rootElement, fo);
		    System.out.println("The file has been generated in the location "+userHomeFolder.concat(fileName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		     
		return true;
	}
	
}
