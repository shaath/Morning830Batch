package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttonseg
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		 WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		 List<WebElement> radios=block.findElements(By.tagName("li"));
		 
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String text=radios.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Multi-city"))
			{
				radios.get(i).click();
				break;
			}
		}
		
	}

}
