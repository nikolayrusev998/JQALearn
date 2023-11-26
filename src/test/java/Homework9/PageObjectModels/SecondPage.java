package Homework9.PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class SecondPage {
    WebDriver driver;
    By fullNameTextField = By.xpath(" //input[@id='userName']");
    By submitBtn = By.xpath("//button[@id='submit']");
    By namePresented = By.xpath("//p[@id='name']");

    public SecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFullName(String username) {
        driver.findElement(fullNameTextField).sendKeys(username);
    }

    public void clickButton() {
        driver.findElement(submitBtn).click();
    }

    public void isNamePresented() {


        assertTrue(driver.findElement(namePresented).isDisplayed());

    }

}
