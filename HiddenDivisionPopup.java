package com.popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HiddenDivisionPopup {

    @Test
    public void facebookTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("harshal.anandas@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("17@shosmgyk");
        driver.findElement(By.name("login")).submit();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        Thread.sleep(5000);
    }
}
