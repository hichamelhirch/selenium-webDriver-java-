package com.hicham.selenium.visitingWebSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/hicha/Desktop/FORMATION/Formation%20Spring/SeleniumTestPro/src/test/resources/index.html");

        Dimension iphoneXR=new Dimension(299,886);
        driver.manage().window().setSize(iphoneXR);
    }
}
