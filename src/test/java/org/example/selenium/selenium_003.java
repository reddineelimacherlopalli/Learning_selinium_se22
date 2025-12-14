package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium_003 {
    @Test
    public void Test_001(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(),"Login - VWO");

        if(driver.getPageSource().contains("Sign in using SSO")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        }else
            Assert.assertTrue(false);
        driver.quit();


    }
}
