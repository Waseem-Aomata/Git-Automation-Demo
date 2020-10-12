package testingFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	/*Suite means Folder or Package*/
	@BeforeSuite
	public void InstallSoftware() {
		System.out.println("Run this, Before all Clases Inside the Package name [testingFiles] .");
	}
	
	@Test
	public void OPenBrowser() {
		System.out.println("OpenBrowser TestCase");
	}
	
	@Test
	public void FillForm() {
		System.out.println("Fill Form TestCase");
	}
	
	@Test
	public void CloseBrowser() {
		System.out.println("CloseBrowser TestCase");
	}
	
	@AfterSuite
	public void ReinstallSoftware() {
		System.out.println("Run this, After all Clases Inside the Package name [testingFiles] .");
	}

}
