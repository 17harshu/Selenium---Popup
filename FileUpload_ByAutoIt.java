package com.popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUpload_ByAutoIt {
    @Test
    public void file_Upload_AutoIT_popUP() throws InterruptedException, IOException {       //  4
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\FileUploadByAUTOIT\\File Upload.exe");
    }
}
