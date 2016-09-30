
public class polindrome
{
	public static void main(String[] args) 
	{
		String Reverse="";
		String Original="dad";
		int len=Original.length();
		
		for (int i = len-1; i>=0; i--) 
		{
			Reverse=Reverse+Original.charAt(i);
		}
			
		System.out.println(Reverse);
		if (Original.equalsIgnoreCase(Reverse)) 
		{
			System.out.println("Given String is Polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
