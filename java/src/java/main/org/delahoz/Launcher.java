package org.delahoz;
import org.delahoz.library.Lib1;
import org.delahoz.library.Lib2;
import org.delahoz.library.Lib3;
public class Launcher {
    public static void main (String[] x){
	String msg = Lib2.readLine();
	Lib3.addString(msg);
	Lib1.displayMessage(Lib3.getString());
    }
}
