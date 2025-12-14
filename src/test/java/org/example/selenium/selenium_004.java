package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_004 {
    @Test
    public void  Checktitle(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();


    }
}
