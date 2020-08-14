package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    // driver'ımızı ekranı kaplayacak şekilde kullanalım.
    // 1 - ilk önce google.com'a gidelim.
    // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
    // 3 - daha sonra youtube.com'a gidelim.
    // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
    // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
    // 6 - driver'ımızı kapatalım.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");
        String sayfaTitle= driver.getTitle();
        System.out.println(sayfaTitle);

        driver.navigate().to("http://www.youtube.com");
        String TitleYoutube= driver.getTitle();
        System.out.println(TitleYoutube);
        String sayfaUrl=driver.getCurrentUrl();
        System.out.println (sayfaUrl);

        driver.navigate().back();

        String googleUrl= driver.getCurrentUrl();
        System.out.println(googleUrl);
        driver.quit();

    }

}
