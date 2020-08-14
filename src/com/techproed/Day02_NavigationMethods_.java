package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods_ {

    public static void main(String[] args) {
        // java projemize, chrome driver'a gitmseni söyledik.
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        // obje olusturduk.
        WebDriver webDriver=new ChromeDriver();

        webDriver.manage().window().maximize();

        // driver'a google.com'a gitmsini söyledik.
        webDriver.get("http://google.com");

        // get methodu ile ayni islemi yapiyor
        webDriver.navigate().to("http://amazon.com");

        // navigate().back() komutu bir önceki sayfaya geri dönmeye yarıyor.
        webDriver.navigate().back();

        /*  navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
            örnek : google -> amazona gittik -> amazondan google'a geri geldik
            eğer forward yaparsak, amazona geri gideriz.
        */

        webDriver.navigate().forward();

        // navigate().refresh(); methodu sayfayi yenilemeye yariyor.
        webDriver.navigate().refresh();


    }
}
