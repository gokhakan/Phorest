package com.phorest.stepDefinitions;

import com.phorest.pages.ConfirmPage;
import com.phorest.pages.HomePage;
import com.phorest.pages.PaymentPage;
import com.phorest.utilities.ConfigurationReader;
import com.phorest.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static com.phorest.utilities.Driver.driver;

public class Steps {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    HomePage homePage = new HomePage();
    ConfirmPage confirmPage = new ConfirmPage();
    PaymentPage paymentPage = new PaymentPage();

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
        Thread.sleep(1000);
        homePage.emailField.sendKeys(email);
    }

    @When("user enters {string} as first name")
    public void user_enters_as_first_name(String firstName) {
        homePage.firstName.sendKeys(firstName);
    }

    @When("user enters {string} as last name")
    public void user_enters_as_last_name(String surname) {
        homePage.surname.sendKeys(surname);
    }

    @When("user clicks checkout")
    public void user_clicks_checkout() {
        homePage.checkout.click();
    }

    @Then("user is on confirm page")
    public void user_is_on_confirm_page() {
        Assert.assertEquals("Buy a Gift Card", Driver.get().getTitle());
    }

    @When("user clicks Confirm Details")
    public void user_clicks_Confirm_Details() throws InterruptedException {
        Thread.sleep(3000);
        confirmPage.confirmDetails.click();
    }

    @Then("user is on payment page")
    public void user_is_on_payment_page() {
        Assert.assertEquals("https://gift-cards.phorest.com/salons/demous#payment", Driver.get().getCurrentUrl());
    }

    @When("user enters card number")
    public void user_enters_card_number() throws InterruptedException {
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 100)");
        Thread.sleep(3000);
        paymentPage.cardNumber.click();
        Thread.sleep(3000);
        paymentPage.cardNumber.sendKeys(ConfigurationReader.get("cardNumber"));
        Thread.sleep(3000);
        paymentPage.submit.click();
    }

}


