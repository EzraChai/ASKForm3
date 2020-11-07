package com.javaframework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary ;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class FireFoxSeleniumTest {
    public static void main(String[] args) {
        System.setProperty("firefox_dev_library","C:\\Users\\juanz\\IdeaProjects\\ASKForm3\\Drivers\\geokodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Firefox Developer Edition\\firefox.exe")));
        FirefoxDriver driver = new FirefoxDriver(options);
        //driver.get("www.google.com");
    }
}
