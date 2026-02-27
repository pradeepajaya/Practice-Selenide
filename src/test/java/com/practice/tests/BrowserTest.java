package com.practice.tests;

import com.codeborne.selenide.Configuration;
import com.practice.tests.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;


public class BrowserTest {

   @BeforeEach
    public void setUp(){
      Configuration.timeout=10000;
      open("https://ikman.lk/en");
      System.out.println("Starting Chrome Browser...");

   }

   @Test
    public void testIkmanIsOpen(){
       HomePage homepage = page(HomePage.class);
       System.out.println("Successfully opened the Ikman Homepage...");
       homepage.VehicleMenuLink.click();
       System.out.println("Successfully opened the Ikman Vehicle page...");
//       homepage.PropertyMenuLink.click();
   }
   @AfterEach
    public void tearDown(){
       System.out.println("This is enough ads for today!!!!,Earn more money & come back");
       closeWebDriver();
   }





}
