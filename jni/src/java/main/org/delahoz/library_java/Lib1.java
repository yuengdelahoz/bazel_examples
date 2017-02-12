package org.delahoz.library_java;

import java.util.Random;

public class Lib1{
	public static int getRandomNumber(){
		Random rnd = new Random();
		return rnd.nextInt();
	}
}

