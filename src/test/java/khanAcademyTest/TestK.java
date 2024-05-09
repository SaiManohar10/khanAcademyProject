package khanAcademyTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import capability.CapabilitySetUp;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestK extends CapabilitySetUp {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest 
	public void bt() throws MalformedURLException {
		driver = capabilitiesSetUp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test (enabled = false, priority = 1)
    public void scrollIntoViewTest() throws InterruptedException {
        // Scroll into view a specific element
        AndroidElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                        "new UiSelector().text(\"NCLEX-RN\"))"));
        // Perform actions on the element, such as clicking it or getting its text
        // For example, element.click() or element.getText()
        
    }
	// To verify Adding a video to bookmark and see in bookmarks
	@Test(enabled = false, priority = 2)
	public void test1() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("SAT")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'SAT Math practice']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'Solving linear equations and linear inequalities — Basic example']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Add to Bookmarks")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'Bookmarks']")).click();
		Thread.sleep(2000);
	}
	// To verify Adding a topic to bookmark and see in bookmarks
	@Test(enabled = false, priority = 3)
	public void test2() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("MCAT")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Add to Bookmarks")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'Bookmarks']")).click();
		Thread.sleep(2000);
	}
	// To verify  whether i can signup and click on bookmarks
	@Test(enabled = false)
	public void test3() throws InterruptedException {
		driver.findElement(MobileBy.xpath("//*[@text = 'Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'SIGN UP WITH EMAIL']")).click();
		Thread.sleep(2000);
	}
	// To verify able to search not available thing
	@Test(enabled = false)
	public void test4() throws InterruptedException {
		driver.findElement(MobileBy.xpath("//*[@text = 'Search']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'Search']")).sendKeys("Masai");
		Thread.sleep(2000);
	}
	//To verify able to search available content
	@Test(enabled = true)
	public void test5() throws InterruptedException {
		driver.findElement(MobileBy.xpath("//*[@text = 'Search']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text = 'Search']")).sendKeys("SAT");
		Thread.sleep(2000);
	}
		
	
	

}
