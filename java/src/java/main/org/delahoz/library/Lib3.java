package org.delahoz.library;
import org.json.JSONObject;
public class Lib3 {
	public static JSONObject json = new JSONObject();
	
	public static void addString (String msg){
		json.put("message",msg);
	}

	public static String getString(){
		return json.getString("message");
	}

}
