package za.co.raytesting.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonStep {

    @Before
    public void intializeDriver() {

    }

    @BeforeTest
    public void loadProperties() {

    }

    @AfterTest
    public void quitDriver() {

    }

    @Given("User navigate to the {string} page")
    public void userNavigateToThePage(final String url) {
        System.out.println("User navigate to the {string} page");
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
    }

    @Then("the scheme number is {string}")
    public void theSchemeNumberIs(String arg0) {
    }
}
