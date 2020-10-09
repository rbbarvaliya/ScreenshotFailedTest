package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)// to listen the customlistener to call failed method.

public class ScreenshotTest extends Base {
	
	@BeforeMethod 
	public void setUp() {
		initialization();
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenshotTest3() {
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
	}

}
