package com.phorest.pages;

import com.phorest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    public PaymentPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@name='cardnumber']")
    public WebElement cardNumber;

    @FindBy(xpath = "//button[@data-action='stripe-purchase#confirmPayment']")
    public WebElement submit;

}
