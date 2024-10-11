package com.hicham.selenium.visitingWebSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleWithSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://hichamelhirch.vercel.app/");
        String title = driver.getTitle();
        System.out.println("the current title  is "+title);

    }
}
