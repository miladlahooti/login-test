package org.example.untitled;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {

    private WebDriver driver;

    @BeforeEach
    void setUp(){
        driver = new FirefoxDriver();
    }

    @AfterEach
    void down(){
        driver.quit();
    }
    @Test
    public void loginTest(){

        driver.get("https://www.digikala.com");
        driver.findElement(By.className("c-header__btn-login")).click();
        WebElement userName = driver.findElement(By.name("login[email_phone]"));
        userName.sendKeys("miladlahooti71@gmail.com");
        driver.findElement(By.className("c-login__form-action")).click();
        WebElement password = driver.findElement(By.name("login[password]"));
        password.sendKeys("1371Ml71");
        driver.findElement(By.className("o-btn--contained-red-lg")).click();
        WebElement profileInfo =driver.findElement(By.className("c-header__btn-profile"));
        profileInfo.click();

    }
}