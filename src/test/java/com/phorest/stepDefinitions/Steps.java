package com.phorest.stepDefinitions;

import com.phorest.pages.ConfirmPage;
import com.phorest.pages.HomePage;
import com.phorest.pages.PaymentPage;
import com.phorest.pages.SuccessPage;
import com.phorest.utilities.BrowserUtils;
import com.phorest.utilities.ConfigurationReader;
import com.phorest.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steps {

    HomePage homePage = new HomePage();
    ConfirmPage confirmPage = new ConfirmPage();
    PaymentPage paymentPage = new PaymentPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();
    @Given("user is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("user selects Gift Card Value")
    public void user_selects_Gift_Card_Value() throws InterruptedException {
        Thread.sleep(2000);
        homePage.RadioButton50.click();
        Thread.sleep(2000);

    }

    @When("user enters {string}")
    public void user_enters(String email) {
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
        Thread.sleep(2000);
        Driver.get().findElement(By.xpath("//button[@data-action='confirm#confirmAction']")).click();
        Thread.sleep(2000);

    }

    @Then("user is on payment page")
    public void user_is_on_payment_page() throws InterruptedException {
        Assert.assertEquals("https://gift-cards.phorest.com/salons/demous#payment", Driver.get().getCurrentUrl());
        Thread.sleep(2000);
    }

    @When("user enters card details")
    public void user_enters_card_details() throws InterruptedException {
        Driver.get().findElement(By.xpath("//*[@id=\"footer\"]/div[2]/a[2]")).click();
        Driver.get().navigate().back();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        paymentPage.fillInCardNumber();
        Thread.sleep(2000);
    }

    @Then("{string} message is displayed")
    public void message_is_displayed(String message) {
        Assert.assertEquals(message, new SuccessPage().successMessage.getText());
    }

}

