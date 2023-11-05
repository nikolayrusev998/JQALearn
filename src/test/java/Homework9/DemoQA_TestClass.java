package Homework9;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class DemoQA_TestClass extends HelperClass{

    @Test
    public void IsNamePresented(){

        WebElement fullName_textField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));


        fullName_textField
                .clear();
        fullName_textField
                .sendKeys("Random Randomov");
        submitBtn
                .click();
        WebElement name_presented = driver.findElement(By.xpath("//p[@id='name']"));
        assertTrue(name_presented.isDisplayed());

    }

    @Test
    public void IsEmailPresented(){
        WebElement email_textField = driver.findElement(By.cssSelector("input#userEmail"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));

        email_textField
                .clear();
        email_textField
                .sendKeys("randomrandomov@abv.bg");
        submitBtn
                .click();


        WebElement email_presented = driver.findElement(By.cssSelector("p#email"));
        assertTrue(email_presented.isDisplayed());

    }
    @Test
    public void IsEveryInformationPresented(){
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

        WebElement name_presented = driver.findElement(By.xpath("//p[@id='name']"));
        WebElement email_presented = driver.findElement(By.xpath("//p[@id='email']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        WebElement currentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));

        assertTrue(email_presented.isDisplayed());
        assertTrue(name_presented.isDisplayed());
        assertTrue(currentAddress.isDisplayed());
        assertTrue(permanentAddress.isDisplayed());


    }
}
