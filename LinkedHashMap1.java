package ex1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
	public static void main(String [] arg)
	{
		LinkedHashMap<Integer,String> m=new LinkedHashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		m.put(3,"Chikku"); 
		m.put(5,"Kiwi");
		
		int count=m.size()-1;
		for (Map.Entry<Integer,String> entry : m.entrySet()) {
			if(count>0)
			{
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
			 count --;
			 }
			else
			{
				break;
			}
			
		}


		
	}

}
