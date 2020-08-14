package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");

        String titleYoutube = driver.getTitle();

        if(titleYoutube.toLowerCase().contains("video")){
            System.out.println("Video kelimesi var.");
        }else{
            System.out.println("Video kelimesi yok");
        }
        driver.quit();


    }
}
