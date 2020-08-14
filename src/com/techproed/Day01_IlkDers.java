package com.techproed;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // java projemize chrome driver'i tanittik.
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        // selenium ile ilgili ilk kodumuz
        // webdriver nesnesi olusuturarak chrome driveri kullanilabilir hale getirdik.

        WebDriver webdriver = new ChromeDriver();

        // driver'ımıza google.com'a gitmesini söyledik.
        webdriver.get("http://google.com");
        //driverımızda açık olan pencereyi kapatır.
       // webdriver.close();

        //driverımı komple kapatıyor
       // webdriver.quit();



    }
}