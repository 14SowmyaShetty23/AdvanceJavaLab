package ex1;


import java.util.TreeMap;


public class TreeMap2 {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		System.out.println("KEY C1 present "+m.containsKey("C1"));
		System.out.println("KEY C4 present "+m.containsKey("C4"));


		
	}

}
