package Homework10.Tests;

import Homework9.PageObjectModels.HomePage;
import Homework9.PageObjectModels.SecondPage;
import Homework10.helpers.Hooks;
import org.junit.Test;

public class DemoQATests extends Hooks {


    private HomePage homePage; // this will run with Selenium 4 (page factory)
    private SecondPage sndPage; // This will run with Selenium 3



    @Test
    public void IsNamePresented() {

        homePage = new HomePage(driver);

        homePage.enterFullName("Random Randomov");
        homePage.clickSubmitButton();
        homePage.namePresented();


    }
    @Test
    public void IsNamePresented1() {
        sndPage = new SecondPage(driver);

        sndPage.fillFullName("Random");
        sndPage.clickButton();
        sndPage.isNamePresented();


    }

    @Test
    public void IsEmailPresented() {
        homePage = new HomePage(driver);
        homePage.enterEmail("randomemail@random.com");
        homePage.clickSubmitButton();
        homePage.emailPresented();


    }
}
