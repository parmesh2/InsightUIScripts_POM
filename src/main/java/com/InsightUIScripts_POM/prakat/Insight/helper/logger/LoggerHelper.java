package com.InsightUIScripts_POM.prakat.Insight.helper.logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class LoggerHelper{
	private static boolean root=false;
	public static  Logger getLogger(Class cls) {
		if(root) {
			return Logger.getLogger(cls);
		}

		PropertyConfigurator.configure("D:\\CatalystPOM\\InsightUIScripts_POM\\resources\\configfile\\log4j.properties");
		root =true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log=LoggerHelper.getLogger(LoggerHelper.class);
		log.info("logger is configured");
	}

}
