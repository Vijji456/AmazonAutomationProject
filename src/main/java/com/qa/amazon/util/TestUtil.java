package com.qa.amazon.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.amazon.base.BaseTest;

public class TestUtil extends BaseTest{
	static String parentWindow;
	static String childWindow;
	
	public static void switchToWindow() {
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		parentWindow=it.next();
		System.out.println("Parent window id: "+parentWindow);
		childWindow=it.next();
		System.out.println("Child Window id: "+childWindow);
		
		driver.switchTo().window(childWindow);
	}
	
	
		public static void takeScreenshotAtEndOfTest() throws IOException {
			String currentDir=System.getProperty("user.dir");
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileHandler.copy(screenshot, new File(currentDir+"//Screenshots//"+System.currentTimeMillis()+".png"));
	}

}
