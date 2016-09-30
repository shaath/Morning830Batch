package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg1 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.className("g-popup-close")).click();
		
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		
		Select from=new Select(fdrop);
		
		List<WebElement> flist=from.getOptions();
		System.out.println(flist.size());
		
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		
		Select to=new Select(tdrop);
		
		
		for (int i = 0; i < flist.size(); i++) 
		{
			from.selectByIndex(i);
			String fCity=flist.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tlist=to.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				to.selectByIndex(j);
				String tCity=tlist.get(j).getText();
				if (fCity.equalsIgnoreCase(tCity))
				{
					flag=true;
					break;
				}
			}
			
			if (flag==true)
			{
				System.out.println("Fail");
			}
			else
			{
				System.out.println("Pass");
			}
		}
		
		
	}

}
