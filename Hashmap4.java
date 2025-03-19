package ex1;

import java.util.HashMap;

public class Hashmap4 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		System.out.println("IsEmpty "+m.isEmpty());
		m.clear();
		System.out.println("IsEmpty "+m.isEmpty());
		
	}
	

}
