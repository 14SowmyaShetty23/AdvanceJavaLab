package ex1;

import java.util.HashMap;


public class Hashmap2 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		System.out.println(m.size());
		m.clear();
		System.out.println(m.size());
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		System.out.println(m.size());
		


		
	}

}
