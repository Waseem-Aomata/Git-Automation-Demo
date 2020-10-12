package testingFiles;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Annotations {
	
	
	/*Important Concepts*/
	
	@BeforeMethod
	public void BeforeEveryTest() {
		System.out.println("Run Before Every Test.");
	}
	
	@BeforeTest
	public void RunOnceBeforeTest() {
		System.out.println("Run once Before Tests.");
	}
	
	@Test
	public void OpenBrowser() {
		 System.out.println("Test to Open Browser.");
	} 
	
	@Test
	public void FlighBooking() {
		System.out.println("Test to Book Flight.");
	}
	
	@AfterMethod
	public void AfterEveryTest() {
		System.out.println("Run After Every Test.");
	}
	
	@AfterTest
	public void RunOnceAfterTest() {
		System.out.println("Run Once After Tests.");
	}
	

}
