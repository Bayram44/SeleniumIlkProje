package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Bayram/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");


        String amazonTitle = driver.getTitle();// sayfanin baslagini aliyoruz

        // contains -> bir kelimenin, bir yazı içerisinde geçip geçmediğini kontrol ediyordu.
        if(amazonTitle.toLowerCase().contains("books")){
            System.out.println("Books kelimesi geciyor");
        }else{
            System.out.println("Books kelimesi gecmiyor");
        }
        driver.quit();


    }
}
