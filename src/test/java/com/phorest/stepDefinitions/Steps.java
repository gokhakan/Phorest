package com.phorest.stepDefinitions;

import com.phorest.pages.HomePage;
import com.phorest.utilities.ConfigurationReader;
import com.phorest.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps {

    HomePage homePage = new HomePage();

    @Given("user is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        Thread.sleep(3000);
    }

    @When("user selects Gift Card Value")
    public void user_selects_Gift_Card_Value() throws InterruptedException {
        Thread.sleep(3000);
        homePage.RadioButton50.click();
    }

    @When("user enters {string}")
    public void user_enters(String email) throws InterruptedException {
        Thread.sleep(3000);
        homePage.emailField.click();

        homePage.emailField.sendKeys(email);
        Thread.sleep(19000);
    }

    @When("user enters {string} as first name")
    public void user_enters_as_first_name(String firstName) {
        homePage.firstName.sendKeys(firstName);
    }

}


