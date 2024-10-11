package com.hicham.selenium.openingBrowers.chrome.firefox;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowserUsingDriver {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver webDriver=new FirefoxDriver();


    }
}
