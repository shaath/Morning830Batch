package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class calanderops 
{
	public static void main(String[] args) 
	{
		String date="2017/november/18";
		String[] split=date.split("/");
		String day=split[2];
		String month=split[1];
		String year=split[0];
		
		System.out.println(day+"--"+month+"---"+year);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
//		WebDriver driver=new FirefoxDriver();
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
