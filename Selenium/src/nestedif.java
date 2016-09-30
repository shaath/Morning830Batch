
public class nestedif {

	public static void main(String[] args) 
	{
		int a=500000;
		int b=60000;
		int c=7000;
		
		if (a>b & a>c) 
		{
			System.out.println("A is greater");
		}
		else if (b>c & b>a) 
		{
			System.out.println("B is Greatter");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
