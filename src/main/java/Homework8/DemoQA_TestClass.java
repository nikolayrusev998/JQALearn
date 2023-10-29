package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName_textField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement email_textField = driver.findElement(By.cssSelector("input#userEmail"));
        WebElement currentAddress_textField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddress_textField = driver.findElement(By.cssSelector("#permanentAddress"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));

        fullName_textField
                .clear();
        fullName_textField
                .sendKeys("Random Randomov");

        email_textField
                .clear();
        email_textField
                .sendKeys("randomrandomov@random.com");

        currentAddress_textField
                .clear();
        currentAddress_textField
                .sendKeys("Adress N25");

        permanentAddress_textField
                .clear();
        permanentAddress_textField
                .sendKeys("Adress N21");

        submitBtn
                .click();

        driver.quit();






    }
}
