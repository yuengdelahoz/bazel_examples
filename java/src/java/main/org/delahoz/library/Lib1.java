package org.delahoz.library;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Lib1 {
	static final Logger LOG= Logger.getLogger("Lib1");
	public static void displayMessage(String msg){
		LOG.log(Level.INFO,"Your message is: " + msg);
    }
}
