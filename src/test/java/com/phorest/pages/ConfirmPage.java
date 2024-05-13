package com.phorest.pages;

import com.phorest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
    public ConfirmPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@data-action='confirm#confirmAction']")
    public WebElement confirmDetails;

}
