import java.util.ArrayList;


public class arraylisteg 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//writing the data into array list
		
		x.add("Selenium");
		x.add("Manual");
		x.add(2, "UFT");
		x.add("LoadRunner");
		x.add(1, "QEdge");
	
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
			
		}
	}
}
