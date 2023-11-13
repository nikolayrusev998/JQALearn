package Homework10.PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage {
    WebDriver driver;
    By fullNameTextField = By.xpath(" //input[@id='userName']");
    By submitBtn = By.xpath("//button[@id='submit']");

    By namePresented = By.xpath("//p[@id='name']");

  public SecondPage(WebDriver driver){
       this.driver=driver;
   }

    public void fillFullName(String username){
        driver.findElement(fullNameTextField).sendKeys(username);
    }
    public void clickButton(){
        driver.findElement(submitBtn).click();
    }

}