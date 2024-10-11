package com.hicham.selenium.visitingWebSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazeAndFullScreen {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/hicha/Desktop/FORMATION/Formation%20Spring/SeleniumTestPro/src/test/resources/index.html");
        //driver.manage().window().maximize();
        //driver.manage().logs();
        driver.manage().window().fullscreen();
    }
}
