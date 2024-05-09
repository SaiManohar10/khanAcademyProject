package capability;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitySetUp {
	AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> capabilitiesSetUp() throws MalformedURLException {
		DesiredCapabilities obj = new DesiredCapabilities();
		obj.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		obj.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoMobile");
		obj.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		obj.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		obj.setCapability(MobileCapabilityType.NO_RESET, true);
		obj.setCapability(MobileCapabilityType.AUTOMATION_NAME , AutomationName.ANDROID_UIAUTOMATOR2);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),obj);
		return driver;
	}

}
