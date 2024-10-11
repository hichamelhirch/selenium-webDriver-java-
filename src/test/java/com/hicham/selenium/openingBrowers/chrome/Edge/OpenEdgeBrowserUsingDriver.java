package com.hicham.selenium.openingBrowers.chrome.Edge;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowserUsingDriver {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver webDriver=new EdgeDriver();
    }
}
