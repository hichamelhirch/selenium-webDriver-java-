package com.hicham.selenium.visitingWebSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://hichamelhirch.vercel.app/");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }
}
