package functions;

public class userLoginTC {

	public static void main(String[] args)
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.org_Login("SharathChandra", "SharathChandra");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close Successfull");

	}

}
