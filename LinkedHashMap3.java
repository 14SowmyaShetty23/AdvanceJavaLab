package ex1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap3 {
	public static void main(String [] arg)
	{
		LinkedHashMap<String,String> m=new LinkedHashMap<>();
		m.put("Java","1995");
		m.put("Python","1991");
		m.put("JavaScript","1995"); 
		
		for (Map.Entry<String,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " developed in " + entry.getValue());
			 }


		
	}

}
