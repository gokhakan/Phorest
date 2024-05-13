package com.phorest.pages;

import com.phorest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "option50")
    public WebElement RadioButton50;

    @FindBy(xpath = "//input[@data-target='email.purchaserEmailInput']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@data-target='name.purchaserFirstNameInput']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@data-target='name.purchaserLastNameInput']")
    public WebElement surname;

    @FindBy(xpath = "//button[@data-target='checkout.checkoutButton']")
    public WebElement checkout;



}
