package com.gradebook.factories;

public class ParseFileFactory {
	
	public static ParseFileFactory getParserFactory() {
		ParseFileFactory pff = new ParseFileFactory();
		return pff;
	}
}
