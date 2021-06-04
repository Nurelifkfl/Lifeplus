package com.lifeplus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(xpath = "//*[text()='Log in or register']")
    WebElement loginButton;


}
