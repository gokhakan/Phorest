package com.phorest.pages;

import com.phorest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
    public SuccessPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "text-xl font-medium mb-8")
    public WebElement successMessage;

}
