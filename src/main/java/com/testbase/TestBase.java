package com.testbase;

import org.testng.annotations.BeforeMethod;

public class TestBase extends Keyword
{
	public static Keyword keyword=new Keyword();
	@BeforeMethod
	public static void lauchBrowser()
	{
		
		openBrowser("Chrome");
		openUrl("https://www.goibibo.com");
		windowMax();
	}
}
