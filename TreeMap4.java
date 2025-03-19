package ex1;

import java.util.TreeMap;


public class TreeMap4 {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		System.out.println("First Key "+m.firstKey());
		System.out.println("Last Key "+m.lastKey());


		
	}

}
