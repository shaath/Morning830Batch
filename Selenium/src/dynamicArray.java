
public class dynamicArray {

	public static void main(String[] args)
	{
		Object[] s=new Object[10];
		
		//finding the length of the array
		
		System.out.println(s.length);
		
		//writing the data into the array
		
		s[5]="Selenium";
		s[2]=50000;
		s[8]='M';
		s[0]=true;
		
		
		System.out.println(s.length);
		
		//Reading the values from an array
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}

	}

}
