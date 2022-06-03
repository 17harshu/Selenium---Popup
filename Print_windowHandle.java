package com.popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_windowHandle {
    @Test
    public void windowHandle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.close();
    }
}
