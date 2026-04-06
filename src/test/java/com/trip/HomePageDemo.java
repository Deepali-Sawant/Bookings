package com.trip;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.fileUtilities.Locators;
import com.testbase.Keyword;
import com.testbase.TestBase;



	public class HomePageDemo extends TestBase implements Locators
	{	

		 
		 @Test
		public static void verifySearchButton() throws InterruptedException 
		{
			RemoteWebDriver driver=new FirefoxDriver();
			driver.get("https://www.goibibo.com/");//url
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();//close popup
			Thread.sleep(3000);
			driver.findElement(By.tagName("body")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();//formInputCityBox
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Mumbai");//fromCityTextBox
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"BOM\")]")).click();//SelectFromCity
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();//ToCityinputBox
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Shirdi");//ToCityTextBox
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"SAG\")]")).click();//selectToCity
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=\"DayPicker-wrapper\"]/div)[2]/div[1]/div[3]/div[4]/div[@aria-label=\"Fri Mar 27 2026\"]")).click();//departure date
			Thread.sleep(3000);
			
			
			Actions action=new Actions(driver);
			action.scrollByAmount(0,500).perform();
			driver.findElement(By.xpath("//a[contains(text(),\"Search\")]")).click();
			
			
		}
		//@Test
		public void verifySearchButtonWithKeyword()
		{
			clickOnElement("xpath","//span[@class=\"logSprite icClose\"]");
			clickOnElement("xpath","//input[@id=\"fromCity\"]");
			enterText("xpath","//input[@id=\"fromCity\"]","Mumbai");
			clickOnElement("xpath","//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"BOM\")]");
			clickOnElement("xpath","//input[@id=\"toCity\"]");
			enterText("xpath","//input[@placeholder=\"To\\","Shirdi");
			clickOnElement("xpath","//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"SAG\")]");
			clickOnElement("xpath","(//div[@class=\"DayPicker-wrapper\"]/div)[2]/div[1]/div[3]/div[4]/div[@aria-label=\"Sat Mar 28 2026\"]");
			
		}
		public static void FlightsearchFrom_To() throws InterruptedException
		{
			windowMax();
			clickOnElement("xpath",Close_Button_Popup);
			Thread.sleep(3000);
			clickOnElement("xpath", from_InputCity_Boxclick);
			Thread.sleep(3000);
			enterText("xpath", from_City_TextBox, From_City);
			//scrollBy();
			Thread.sleep(3000);
			clickOnElement("xpath", To_City_inputBox);
			Thread.sleep(3000);
			enterText("xpath", To_City_TextBox,To_City);
			Thread.sleep(3000);
			clickOnElement("xpath", select_To_City);
			Thread.sleep(5000);
			clickOnElement("xpath", departure_date);
			Thread.sleep(3000);
			clickOnElement("xpath", Search_button);
			closeAllWindow();
			
			
		}
		
		
	}



