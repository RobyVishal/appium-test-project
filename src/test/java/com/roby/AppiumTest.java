package com.roby;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class AppiumTest {
    public static void main(String[] args) {
        try {
            // Set the desired capabilities for the Appium session
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");  // For Android testing
            caps.setCapability("deviceName", "Android Emulator");  // Use an emulator
            caps.setCapability("app", "/Users/roby/Downloads/CapCut\\ -\\ Video\\ Editor_12.8.0_APKPure.apk");


            // Initialize the Android driver and start the Appium session
            AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
            System.out.println("App started successfully!");

            // You can add more test code here (e.g., interactions with the app)

            // Quit the driver after the test
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

