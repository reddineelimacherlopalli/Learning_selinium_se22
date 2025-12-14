package org.example.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_005 {
    @Description("Validating error message")
    @Test
     public void Error_message()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement email=driver.findElement(By.id("login-username"));
        email.sendKeys("Neel@gmail.com");
        WebElement pwd=driver.findElement(By.name("password"));
        pwd.sendKeys("Pwd@1234");
        WebElement sign_in=driver.findElement(By.id("js-login-btn"));
        sign_in.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement msg=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(msg.getText(),"Your email, password, IP address or location did not match");
       driver.quit();



    }
}
