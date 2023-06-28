
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileDemo {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "xioaomi 2106119B1"); // write any valuble name
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554"); // get from adb devices from cmd .
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		capabilities.setCapability(MobileCapabilityType.APP,
				"D:\\M A H E S\\S T U D Y\\Appium\\APK -file\\indiamart-13-1-6.apk");

		// capabilities.setCapability("appPackage", "com.miui.calculator");
		// capabilities.setCapability("appActivity",
		// "com.miui.calculator.cal.CalculatorActivity Calculator");

		URL link = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("before Appium Driver");
		AppiumDriver<MobileElement> appiumDriver = new AppiumDriver<<MobileElement>>(link, capabilities);
		System.out.println("After Appium Driver");

	}
}