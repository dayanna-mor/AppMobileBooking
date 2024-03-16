package com.bdd.view;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ReservaBookingView {

    static AndroidDriver androidDriver;

    public static void setAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        capabilities.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clicBuscador(){
        androidDriver.findElement(By.id("com.booking.android:id/start_button")).click();
    }

    public void clicbuscarAlojamiento(){
        androidDriver.findElement(By.id("com.booking.android:id/search_input")).click();
    }

    public void escribirAlojamiento(String sAlojamiento){
        Actions actions = new Actions(androidDriver);
        actions.sendKeys(sDestino).perform();
        androidDriver.findElement(By.id("com.booking.android:id/icon")).click();
    }
}
