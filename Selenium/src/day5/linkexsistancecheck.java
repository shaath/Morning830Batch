package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkexsistancecheck 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
//			System.out.println(links.get(i).getText());
			String lText=links.get(i).getText();
			if (lText.equalsIgnoreCase("Gmail"))
			{
				links.get(i).click();
				flag=true;
				break;
			}
			
		}
		if (flag==true)
		{
			
			System.out.println("Gmail link available in Google page");
		}
		else
		{
			System.out.println("Gmail link not available in Google page");
		}
	}

}
