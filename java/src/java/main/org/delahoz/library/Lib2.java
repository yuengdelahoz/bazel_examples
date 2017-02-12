package org.delahoz.library;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Lib2{
	public static String readLine(){
		System.out.print("Enter message \n->");
		String line = new Scanner(System.in).nextLine();
		return line;
	}

}
