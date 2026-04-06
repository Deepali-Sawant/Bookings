package com.testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.exceptions.InvalidBrowserNameException;



public class Keyword 
{
	public static RemoteWebDriver driver=null;
	public static void openBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome")) 
		{
			driver=new ChromeDriver();			
		}
		else if(browsername.equalsIgnoreCase("FireFox")) 
		{
			driver=new FirefoxDriver();			
		}
		else if(browsername.equalsIgnoreCase("Edge")) 
		{
			driver=new EdgeDriver();			
		}
		else
		{
			throw new InvalidBrowserNameException();
		}
		System.out.println("Browser is opened Successfully.....");
	}
	public static void openUrl(String url)
	{
		driver.get(url);
	}
	public static void windowMax()
	{
		driver.manage().window().maximize();
	}
	public static void clickOnElement(String locatorType,String locator)
	{
		if(locatorType.equalsIgnoreCase("id")) 
		{
			driver.findElement(By.id(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("className")) 
		{
			driver.findElement(By.className(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("tagName")) 
		{
			driver.findElement(By.tagName(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("linkText")) 
		{
			driver.findElement(By.linkText(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("partialLinkText")) 
		{
			driver.findElement(By.partialLinkText(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(locator)).click();
		}
		else if(locatorType.equalsIgnoreCase("cssSelector")) 
		{
			driver.findElement(By.cssSelector(locator)).click();
		}
	}
	public static void enterText(String locatorType,String locator,String textToEnter)
	{
		if(locatorType.equalsIgnoreCase("id")) 
		{
			driver.findElement(By.id(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("className")) 
		{
			driver.findElement(By.className(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("tagName")) 
		{
			driver.findElement(By.tagName(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("linkText")) 
		{
			driver.findElement(By.linkText(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("partialLinkText")) 
		{
			driver.findElement(By.partialLinkText(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(locator)).sendKeys(textToEnter);
		}
		else if(locatorType.equalsIgnoreCase("cssSelector")) 
		{
			driver.findElement(By.cssSelector(locator)).sendKeys(textToEnter);
		}
	}
	public static void scrollBy()
	{
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();

	}
	public static void closeAllWindow()
	{
		driver.quit();
	}
	public static void closeWindow()
	{
		driver.close();
	}
}
