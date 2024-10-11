package com.hicham.selenium.openingBrowers.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserUsingDriver {
    public static void main(String[] args) {
        // WebDriverManager va automatiquement télécharger et configurer la bonne version de ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Lance le navigateur Chrome
        WebDriver webDriver = new ChromeDriver();



    }
}
