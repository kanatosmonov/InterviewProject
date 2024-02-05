package google.stepdefinitions;

import google.pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;
import utils.DriverHelper;

public class GoogleStepDefs {
    WebDriver driver = DriverHelper.getDriver();
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    @Given("User navigates to google.com")
    public void user_navigates_to_google_com() {
        driver.get(ConfigReader.readProperty("googleurl"));

    }
    @When("User searches for {string}")
    public void user_searches_for(String word) {
        googleSearchPage.searchItem(word);

    }
    @Then("User gets {string} as the first result")
    public void user_gets_as_the_first_result(String firstResult) {
        Assert.assertEquals(googleSearchPage.firstResult(), firstResult);
    }
}
