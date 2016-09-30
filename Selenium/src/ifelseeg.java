import java.util.Scanner;


public class ifelseeg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		
		String b=sc.next();
		
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the Strings are not same");
		}
		

	}

}
