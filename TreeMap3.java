package ex1;

import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String [] arg)
	{
		TreeMap<Integer,String> m=new TreeMap<>();
		m.put(1,"Apple");
		System.out.println(m.size());
		m.clear();
		System.out.println(m.size());
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		System.out.println(m.size());
		


		
	}
}
