package com.krakedev.ejemplomaven;

import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.warn("Mensaje de warning");
		logger.info("Mensaje de info");
		logger.debug("Mensaje de debug");
		logger.trace("Mensaje de trace");
		
		
		logger.error("Mensaje de error");
		
	}
}
