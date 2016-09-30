
public class reverseString {

	public static void main(String[] args) 
	{
		//QEdge----------> egdEQ
		//dad------------>dad
		String Original="Dad";
		int len=Original.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(Original.charAt(i));
		}

	}

}
