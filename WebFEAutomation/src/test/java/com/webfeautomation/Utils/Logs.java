package com.webfeautomation.Utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	private static Logger Log = Logger.getLogger(Logs.class.getName());
	

	public static void configureLog4JPropertyFile() {
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	public static void info(String message) {
		configureLog4JPropertyFile();
		Log.info(message);

	}

	public static void warn(String message) {
		configureLog4JPropertyFile();
		Log.warn(message);

	}

	public static void error(String message) {
		configureLog4JPropertyFile();
		Log.error(message);

	}

	public static void fatal(String message) {
		configureLog4JPropertyFile();
		Log.fatal(message);

	}

	public static void debug(String message) {
		configureLog4JPropertyFile();
		Log.debug(message);

	}


}
