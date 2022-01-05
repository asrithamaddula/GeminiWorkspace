package com.gemini.api1;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.json.simple.JSONObject;
@WebServlet(name="api1",urlPatterns= {"/api1"})
public class api {
	 public static void main(String args[])
	   {
	       // In java JSONObject is used to create JSON object  
	       // which is a subclass of java.util.HashMap. 
	         
	       JSONObject file = new JSONObject();
	       file.put("Full Name", "Ritu Sharma");
	       file.put("Roll No.", new Integer(1704310046));
	       file.put("Tution Fees", new Double(6540));
	  
	  
	       // To print in JSON format.
	       System.out.print(file);
	        
	   }
}
