package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class autofillerseg 
{
	public static void main(String[] args)
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(7);
		driver.findElement(By.className("modalCloseSmall")).click();
		
		driver.findElement(By.id("txtSource")).sendKeys("H");
	
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='Search']/div[1]/div[1]/ul/li"));
		int cityCnt=list.size();
		
		System.out.println(cityCnt);
		
		for (int i = 0; i < list.size(); i++) 
		{
			String city=list.get(i).getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("hydggdghgsd")) 
			{
				list.get(i).click();
				flag=true;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("The expected city available in the list");
		}
		else
		{
			System.out.println("The expected city not available in the list");
		}

		
	}

}
