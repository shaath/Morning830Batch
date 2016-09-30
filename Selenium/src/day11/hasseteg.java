package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hasseteg 
{
	public static void main(String[] args) 
	{
		
		Set<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Loadrunner");
		s.add("Manual");
		s.add("Manual");
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
	}

}
