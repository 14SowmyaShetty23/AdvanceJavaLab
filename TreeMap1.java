package ex1;

import java.util.*;


public class TreeMap1 {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		for (Map.Entry<String,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
			 }


		
	}

}
