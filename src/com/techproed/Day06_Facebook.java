package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement emailKutusu=driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement sifreKutusu=driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement login= driver.findElement(By.name("login"));
        login.click();

        // Burda java 3000 milisaniye (3 saniye) bekleyecek.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //https://www.facebook.com/login/


        String url= driver.getCurrentUrl();;
        if (url.contains("facebook.com/login/")){
            System.out.println("Basarisiz");
        }else{
            System.out.println("Basarili");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
