package com.gradebook.factories;


public class XMLFileParserFactory extends FileParserFactory {
	
	public FileParser createParser() {
		FileParser fileParser = new XMLFileParser();
		return fileParser;
	}
		
}
