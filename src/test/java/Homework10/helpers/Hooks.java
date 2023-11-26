package Homework10.helpers;

import org.junit.After;
import org.junit.Before;

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
