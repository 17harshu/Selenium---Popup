package com.popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {
    @Test
    public void fileUploadPopUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[1]")).
                sendKeys("C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\test\\java\\com\\demo\\Page1.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-s']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
