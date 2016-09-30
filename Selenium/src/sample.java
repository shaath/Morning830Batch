import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class sample 
{
	@Test
	public void tt()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}

}
