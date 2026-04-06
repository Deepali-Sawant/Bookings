package com.fileUtilities;
public interface Locators 
{
 String Close_Button_Popup="//span[@class='logSprite icClose']";
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
 String To_City="Shirdi";
}