package com.exceptions;

public class InvalidBrowserNameException extends RuntimeException
{
	@Override
	public String getMessage()
	{
		return("Invalid Browser name!Please check TestNG.xml file for correct browser name..");
	}
}
