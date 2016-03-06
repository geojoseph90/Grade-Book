package com.gradebook.factories;

public class JSONFileParserFactory extends FileParserFactory {

	public FileParser createFileParser() {
		
		FileParser parser = new JSONFileParser();
		return parser;
	}
	

}
