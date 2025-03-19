package ex1;

import java.util.HashMap;


public class Hashmap3 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		m.put(3,"Pear"); 
		HashMap<Integer,String> m1=new HashMap<>();
		m1.put(4,"Kiwi");
		m1.put(5,"Orange");
		m1.put(6,"Banana"); 
		m1.forEach((key, value) -> m.merge(key, value, (v1, v2) -> v1 + v2));
		 System.out.println("After merging maps: " + m);
	}
}
