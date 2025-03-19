package ex1;
import java.util.*;
public class Hashmap1 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		m.put(3,"Pear"); 
		
		for (Map.Entry<Integer,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
			 }


		
	}

}
