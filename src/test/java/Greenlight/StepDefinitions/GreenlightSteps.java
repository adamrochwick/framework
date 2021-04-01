package Greenlight.StepDefinitions;

import Greenlight.Pages.Greenlight_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;

public class GreenlightSteps {

    Greenlight_POM greenlight_pom = new Greenlight_POM();

//----------------------------------------------------------------------------------------------------------------------
//Landing Page----------------------------------------------------------------------------------------------Landing Page
    @Given("A user has navigated to Greenlight Landing page")
    public void a_user_has_navigated_to_greenlight_landing_page() {
        boolean verify = greenlight_pom.NavigateToLandingPage();
        Assert.assertTrue(verify);
    }

    @Then("A user should see the Landing page displayed correctly")
    public void a_user_should_see_the_landing_page_displayed_correctly() {
        boolean verify = greenlight_pom.LandingPageIsDisplayed();
        Assert.assertTrue(verify);
    }
//Landing Page----------------------------------------------------------------------------------------------Landing Page
//----------------------------------------------------------------------------------------------------------------------
//About Us------------------------------------------------------------------------------------------------------About Us
    @Given("A user has navigated to Greenlight About Us page")
    public void a_user_has_navigated_to_greenlight_about_us_page() {
        boolean verify = greenlight_pom.NavigateToAboutUsPage();
        Assert.assertTrue(verify);
    }

    @Then("A user should see the About Us page displayed correctly")
    public void a_user_should_see_the_about_us_page_displayed_correctly() {
        boolean verify = greenlight_pom.AboutUsPageIsDisplayed();
        Assert.assertTrue(verify);
    }
//About Us------------------------------------------------------------------------------------------------------About Us
//----------------------------------------------------------------------------------------------------------------------
//Contact Us--------------------------------------------------------------------------------------------------Contact Us
    @Given("A user has navigated to Greenlight Contact Us page")
    public void a_user_has_navigated_to_greenlight_contact_us_page() {
        boolean verify = greenlight_pom.NavigatetoContactUsPage();
        Assert.assertTrue(verify);
    }

    @When("The Contact Us page has loaded correctly")
    public void the_contact_us_page_has_loaded_correctly() {
        boolean verify = greenlight_pom.ContactPageIsDisplayed();
        Assert.assertTrue(verify);
    }

    @Then("A user should be able to successfully fill out and submit a contact form")
    public void a_user_should_be_able_to_successfully_fill_out_and_submit_a_contact_form() {
        greenlight_pom.FillOutContactUsForum();
    }
//Contact Us--------------------------------------------------------------------------------------------------Contact Us
//----------------------------------------------------------------------------------------------------------------------
//Products------------------------------------------------------------------------------------------------------Products
    @Given("A user has navigated to Greenlight Products page")
    public void a_user_has_navigated_to_greenlight_products_page() {
        boolean verify = greenlight_pom.NavigateToProductsPage();
        Assert.assertTrue(verify);
    }

    @Then("A user should see the Products page displayed correctly")
    public void a_user_should_see_the_products_page_displayed_correctly() {
        boolean verify = greenlight_pom.ProductsPageIsDisplayed();
        Assert.assertTrue(verify);
    }
//Products------------------------------------------------------------------------------------------------------Products
//----------------------------------------------------------------------------------------------------------------------
//Careers--------------------------------------------------------------------------------------------------------Careers
    @Given("A user has navigated to Greenlight Careers page")
    public void a_user_has_navigated_to_greenlight_careers_page() {
        boolean verify = greenlight_pom.NavigateToCareersPage();
        Assert.assertTrue(verify);
    }

    @Then("A user should see the Careers page displayed correctly")
    public void a_user_should_see_the_careers_page_displayed_correctly() {
        boolean verify = greenlight_pom.CareersPageIsDisplayed();
        Assert.assertTrue(verify);
    }
//Careers--------------------------------------------------------------------------------------------------------Careers
//----------------------------------------------------------------------------------------------------------------------
//News--------------------------------------------------------------------------------------------------------------News
    @Given("A user has navigated to Greenlight News page")
    public void a_user_has_navigated_to_greenlight_news_page() {
        boolean verify = greenlight_pom.NavigateToNewsPage();
        Assert.assertTrue(verify);
    }

    @Then("A user should see the News page displayed correctly")
    public void a_user_should_see_the_news_page_displayed_correctly() {
        boolean verify = greenlight_pom.NewsPageIsDisplayed();
        Assert.assertTrue(verify);
    }
//News--------------------------------------------------------------------------------------------------------------News
//----------------------------------------------------------------------------------------------------------------------
//API Steps----------------------------------------------------------------------------------------------------API Steps
    @Given("A user goes to Greenlight Health Landing Page")
    public void a_user_goes_to_greenlight_health_landing_page() {
        greenlight_pom.TestAPILandingPage();
    }

    @Then("The Landing Page request shall return Ok")
    public void the_landing_page_request_shall_return_ok() {
        greenlight_pom.VerifyAPILandingPage();
    }

    @Given("A user goes to Greenlight Health About Us Page")
    public void a_user_goes_to_greenlight_health_about_us_page() {
        greenlight_pom.TestAPIAboutUsPage();
    }

    @Then("The About Us request shall return Ok")
    public void the_about_us_request_shall_return_ok() {
        greenlight_pom.VerifyAPIABoutUsPage();
    }

    @Given("A user goes to Greenlight Health Contact Us Page")
    public void a_user_goes_to_greenlight_health_contact_us_page() {
        greenlight_pom.TestAPIContactUsPage();
    }

    @Then("The Contact Us request shall return Ok")
    public void the_contact_us_request_shall_return_ok() {
        greenlight_pom.VerifyAPIContactUsPage();
    }

    @Given("A user goes to Greenlight Health Products Page")
    public void a_user_goes_to_greenlight_health_products_page() {
        greenlight_pom.TestAPIAboutUsPage();
    }

    @Then("The Products request shall return Ok")
    public void the_products_request_shall_return_ok() {
        greenlight_pom.VerifyAPIProductsPage();
    }

    @Given("A user goes to Greenlight Health Careers Page")
    public void a_user_goes_to_greenlight_health_careers_page() {
        greenlight_pom.TestAPIPCareersPage();
    }

    @Then("The Careers request shall return Ok")
    public void the_careers_request_shall_return_ok() {
        greenlight_pom.VerifyAPICareersPage();
    }

    @Given("A user goes to Greenlight Health News Page")
    public void a_user_goes_to_greenlight_health_news_page() {
        greenlight_pom.TestAPINewsPage();
    }

    @Then("The News Page request shall return Ok")
    public void the_news_page_request_shall_return_ok() {
        greenlight_pom.VerifyAPINewsPage();
    }
//API Steps----------------------------------------------------------------------------------------------------API Steps
//----------------------------------------------------------------------------------------------------------------------
}