package com.pom.menus;

import java.sql.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;





/*String Close_Button_Popup="//span[@class='logSprite icClose']";
String Click_on_Body="body";
String from_InputCity_Boxclick="//input[@data-cy=\"fromCity\"]";
String from_City_TextBox="//input[@placeholder=\"From\"]";

String Select_From_City="//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"BOM\")]";

String To_City_inputBox="//input[@id=\"toCity\"]";
String To_City_TextBox="//input[@placeholder=\"To\"]";
String select_To_City="//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"SAG\")]";
String departure_date="//div[@class=\"DayPicker-Months\"]/div[@class=\"DayPicker-Month\"]/div[@class=\"DayPicker-Body\"][1]/div[@class=\"DayPicker-Week\"][4]/div[@aria-label=\"Fri Mar 27 2026\"]/div[@class=\"dateInnerCell\"]";
String Search_button="//a[contains(text(),\"Search\")]";
String From_City="Mumbai";
String To_City="Shirdi";*/

public class PomFlightsPage extends BaseTest
{
	
	
	
	@FindBy(xpath="\"//span[@class='logSprite icClose']\"")
	WebElement Close_Button_Popup;
	
	@FindBy(xpath="body")
	WebElement Click_on_Body;
	
	@FindBy(xpath="//input[@data-cy=\"fromCity\"]")
	WebElement from_InputCity_Boxclick;
	
	@FindBy(xpath="//input[@placeholder=\"From\"]")
	WebElement from_City_TextBox;
	
	@FindBy(xpath="//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"BOM\")]")
	WebElement Select_From_City;
	
	@FindBy(xpath="//input[@id=\"toCity\"]")
	WebElement To_City_inputBox;
	
	@FindBy(xpath="//input[@placeholder=\"To\"]")
	WebElement To_City_TextBox;
	
	@FindBy(xpath="//div[@class=\"revampedSearchSuggestionMain\"]/descendant::span[contains(text(),\"SAG\")]")
	WebElement select_To_City;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Months\"]/div[@class=\"DayPicker-Month\"]/div[@class=\"DayPicker-Body\"][1]/div[@class=\"DayPicker-Week\"][4]/div[@aria-label=\"Fri Mar 27 2026\"]/div[@class=\"dateInnerCell\"]")
	WebElement departure_date;
	
	@FindBy(xpath="//a[contains(text(),\"Search\")]")
	WebElement Search_button;
	
	/*@FindBy(xpath="Mumbai")
	WebElement From_City;
	
	@FindBy(xpath="Shirdi")
	WebElement To_City;*/
	
	
	public void EnterFromCity(String Cityname)
	{
		
		from_InputCity_Boxclick.click();
		from_City_TextBox.sendKeys("Mumbai");
	}
	
	
	
}
