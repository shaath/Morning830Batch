package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grideg2 
{
	@Parameters("browser")
	@Test
	public void grid(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		
		
		if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.LINUX);
			
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		String date="2017/november/18";
		String[] split=date.split("/");
		String day=split[2];
		String month=split[1];
		String year=split[0];
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.24:4444/wd/hub"), cap);
	
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		//year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equalsIgnoreCase(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		//month selection
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//day selection
		List<WebElement> cells=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for (int i = 0; i < cells.size(); i++) 
		{
			String calday=cells.get(i).getText();
			if (calday.equals(day))
			{
				cells.get(i).click();
				break;
			}
		}
	}

}
