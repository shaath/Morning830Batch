import java.util.Scanner;


public class scannereg1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  A Value");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		System.out.println(b);
		
		if (a > b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is Greater");
		}
		
	}

}
