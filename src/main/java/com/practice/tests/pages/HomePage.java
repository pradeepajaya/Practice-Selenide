package com.practice.tests.pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement VehicleMenuLink = $("a[href*='/vehicles']");
//    public SelenideElement PropertyMenuLink = $("a[href*='/properties']");
}