package Homework10.helpers;

import Homework10.PageObjectModels.HomePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hooks extends BrowserFactory{

        @Before
        public void setUp() {
              BrowserFactory.getDriver();

        }

        @After
        public void tearDown() {
            BrowserFactory.quitDriver();
        }
    }
