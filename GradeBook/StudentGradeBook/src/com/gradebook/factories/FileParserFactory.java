package com.gradebook.factories;

public class FileParserFactory {
	public  FileParser getParser(String fileType) {
		
		if(fileType == "JSON") {
			return new JSONFileParser();
		}
		else {
			return new XMLFileParser();
		}
		
	}
}
