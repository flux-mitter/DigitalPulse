package com.contstants;
/**
 * @author preetammitra
 * @created 15 June 2023
 * @information framework created with private so that object cannot be created
 * @implNote Created to store framework constants
 */
public final class FrameworkConstants {
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String PATHTORESOURCES = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CONFIGPROPPATH = PATHTORESOURCES + "/config/config.properties";
	public static String getConfigproppath() {
		return CONFIGPROPPATH;
	}
}
