package com.popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Set;

public class ChildBrowserPopUp {
    @Test
    public void windowHandle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//li[1]//a[1]//div[1]")).click();
        Thread.sleep(4000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Thread.sleep(4000);
        int count = allWindowHandles.size();
        Thread.sleep(4000);
        System.out.println("Number of browser windows opened on the system is : " + count);
        Thread.sleep(4000);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
        }
    }
}
