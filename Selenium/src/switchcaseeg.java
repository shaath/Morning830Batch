
public class switchcaseeg {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		switch (course) 
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":	
			System.out.println("You are selected Manual");
			break;
		case "Loadrunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proper keyword");
			break;
		}

	}

}
