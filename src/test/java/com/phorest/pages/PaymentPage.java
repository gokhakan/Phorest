package com.phorest.pages;

import com.phorest.utilities.ConfigurationReader;
import com.phorest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    public PaymentPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@data-elements-stable-field-name='cardNumber']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@data-elements-stable-field-name='cardExpiry']")
    public WebElement monthAndYear;

    @FindBy(xpath = "//input[@data-elements-stable-field-name='cardCvc']")
    public WebElement CVC;

    @FindBy(xpath = "//button[@data-action='stripe-purchase#confirmPayment']")
    public WebElement submit;

    public void fillInCardNumber() {
        new PaymentPage().cardNumber.sendKeys(ConfigurationReader.get("cardNumber"));
        new PaymentPage().monthAndYear.sendKeys(ConfigurationReader.get("monthAndYear"));
        new PaymentPage().CVC.sendKeys(ConfigurationReader.get("CVC"));
        new PaymentPage().submit.click();
    }

}
