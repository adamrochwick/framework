package Greenlight.Pages;

import Greenlight.Util.driver;
import io.restassured.response.ValidatableResponse;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class Greenlight_POM {

    static WebDriverWait wait = new WebDriverWait(driver.driver(), 30);
    static Actions actions = new Actions(driver.driver());
    static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver.driver();

    public Greenlight_POM(){
        PageFactory.initElements(driver.driver(), this);
    }
//----------------------------------------------------------------------------------------------------------------------
//Landing Page----------------------------------------------------------------------------------------------Landing Page
    @FindBy(xpath = "//div[@class='top-parallax-section' and contains(.,'We Change Everything')]")
    private WebElement LandingPageTopHeader;

    @FindBy(xpath = "//div[@id='shapely_home_parallax-3' and contains(.,'The Premier')]")
    private WebElement LandingPageThePremier;

    @FindBy(xpath = "//div[@id='shapely_home_cfa-2']")
    private WebElement LandingPagePressReleaseSection;

    @FindBy(xpath = "//div[@class='top-parallax-section' and contains(.,'Bigger')]")
    private WebElement LandingPageBiggerIsBetterSection;

    @FindBy(xpath = "//div[@id='shapely_home_parallax-4']")
    private WebElement LandingPageEHRSection;

    public boolean NavigateToLandingPage(){
        String ExpectedUrl = "https://greenlighthealth.com/";
        String url = driver.driver().getCurrentUrl();
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean LandingPageIsDisplayed(){
        boolean display1 = wait.until(ExpectedConditions.visibilityOf(LandingPageTopHeader)).isDisplayed();
        boolean display2 = wait.until(ExpectedConditions.visibilityOf(LandingPageThePremier)).isDisplayed();
        boolean display3 = wait.until(ExpectedConditions.visibilityOf(LandingPagePressReleaseSection)).isDisplayed();
        Greenlight.Util.WebDriverWait.driverwait(1);
        javascriptExecutor.executeScript("window.scrollBy(0, 1200)");
        boolean display4 = wait.until(ExpectedConditions.visibilityOf(LandingPageBiggerIsBetterSection)).isDisplayed();
        boolean display5 = wait.until(ExpectedConditions.visibilityOf(LandingPageEHRSection)).isDisplayed();
        if(display1 && display2 && display3 && display4 && display5){
            return true;
        } else {
            return false;
        }
    }
//Landing Page----------------------------------------------------------------------------------------------Landing Page
//----------------------------------------------------------------------------------------------------------------------
//About Us------------------------------------------------------------------------------------------------------About Us
    @FindBy(xpath = "//a[@title='About Us']")
    private WebElement AboutUsButton;

    @FindBy(xpath = "//div[@id='primary']")
    private WebElement AboutUsTextArticle;

    public boolean NavigateToAboutUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(AboutUsButton)).click();
        String url = driver.driver().getCurrentUrl();
        String ExpectedUrl = "https://greenlighthealth.com/about-us/";
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean AboutUsPageIsDisplayed(){
        boolean display1 = wait.until(ExpectedConditions.visibilityOf(AboutUsTextArticle)).isDisplayed();
        if(display1){
            return true;
        } else {
            return false;
        }
    }
//About Us------------------------------------------------------------------------------------------------------About Us
//----------------------------------------------------------------------------------------------------------------------
//Contact Us--------------------------------------------------------------------------------------------------Contact Us
    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement ContactUsButton;

    @FindBy(xpath = "//div[@id='primary']")
    private WebElement ContactUsForm;

    @FindBy(xpath = "//input[@name='your-name']")
    private WebElement ContactUsYourName;

    @FindBy(xpath = "//input[@name='your-email']")
    private WebElement ContactUsYourEmail;

    @FindBy(xpath = "//input[@name='your-subject']")
    private WebElement ContactUsSubject;

    @FindBy(xpath = "//textarea[@name='your-message']")
    private WebElement ContactUsYourMessage;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement ContactUsSendButton;

    public boolean NavigatetoContactUsPage(){
        actions.moveToElement(AboutUsButton).perform();
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsButton)).click();
        String ExpectedUrl = "https://greenlighthealth.com/contact-us/";
        String url = driver.driver().getCurrentUrl();
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean ContactPageIsDisplayed(){
        boolean verify = wait.until(ExpectedConditions.visibilityOf(ContactUsForm)).isDisplayed();
        if(verify) {
            return true;
        } else {
            return false;
        }
    }

    public void FillOutContactUsForum(){
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsYourName)).sendKeys("Adam Rochwick");
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsYourEmail)).sendKeys("rochwick.adam@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsSubject)).sendKeys("I love what you do!");
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsYourMessage)).sendKeys("This is a test, on an interview with the Steve, Jeff, Alex, and Jon!");
        //wait.until(ExpectedConditions.elementToBeClickable(ContactUsSendButton)).click();
    }
//Contact Us--------------------------------------------------------------------------------------------------Contact Us
//----------------------------------------------------------------------------------------------------------------------
//Products------------------------------------------------------------------------------------------------------Products
    @FindBy(xpath = "//a[@title='Products']")
    private WebElement ProductsButton;

    @FindBy(xpath = "//div[@class='vce-col-content' and contains(.,'Clinical')]")
    private WebElement ProductsHeaderText;

    @FindBy(xpath = "//div[@class='vce-col-content' and contains(.,'Integrate')]")
    private WebElement ProductsIntegrateBox;

    @FindBy(xpath = "//div[@class='vce-col-content' and contains(.,'Access')]")
    private WebElement ProductsAccessBox;

    @FindBy(xpath = "//div[@class='vce-col-content' and contains(.,'Accelerate')]")
    private WebElement ProductsAccelerateBox;

    @FindBy(xpath = "//div[@id='el-5b8f579a']")
    private WebElement ProductsGreenlightDifference;

    @FindBy(xpath = "//div[@class='vce-col-content' and contains(.,'How Does It Work')]")
    private WebElement ProductsHowDoesItWorkHeader;

    @FindBy(xpath = "//div[@id='el-54cb37dd']")
    private WebElement ProductsHowDoesItWorkSection;

    public boolean NavigateToProductsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductsButton)).click();
        String ExpectedUrl = "https://greenlighthealth.com/solutions/";
        String url = driver.driver().getCurrentUrl();
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean ProductsPageIsDisplayed(){
        boolean display1 = wait.until(ExpectedConditions.visibilityOf(ProductsHeaderText)).isDisplayed();
        boolean display2 = wait.until(ExpectedConditions.visibilityOf(ProductsIntegrateBox)).isDisplayed();
        boolean display3 = wait.until(ExpectedConditions.visibilityOf(ProductsAccessBox)).isDisplayed();
        boolean display4 = wait.until(ExpectedConditions.visibilityOf(ProductsAccelerateBox)).isDisplayed();
        boolean display5 = wait.until(ExpectedConditions.visibilityOf(ProductsGreenlightDifference)).isDisplayed();
        boolean display6 = wait.until(ExpectedConditions.visibilityOf(ProductsHowDoesItWorkHeader)).isDisplayed();
        boolean display7 = wait.until(ExpectedConditions.visibilityOf(ProductsHowDoesItWorkSection)).isDisplayed();
        if(display1 && display2 && display3 && display4 && display5 && display6 && display7){
            return true;
        } else {
            return false;
        }
    }
//Products------------------------------------------------------------------------------------------------------Products
//----------------------------------------------------------------------------------------------------------------------
//Careers--------------------------------------------------------------------------------------------------------Careers
    @FindBy(xpath = "//a[@title='Careers']")
    private WebElement CareersButton;

    @FindBy(xpath = "//article[@id='post-157']")
    private WebElement CareersArticle;

    public boolean NavigateToCareersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(CareersButton)).click();
        String ExpectedUrl = "https://greenlighthealth.com/careers/";
        String url = driver.driver().getCurrentUrl();
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean CareersPageIsDisplayed(){
        boolean verify = wait.until(ExpectedConditions.visibilityOf(CareersArticle)).isDisplayed();
        if(verify) {
            return true;
        } else {
            return false;
        }
    }
//Careers--------------------------------------------------------------------------------------------------------Careers
//----------------------------------------------------------------------------------------------------------------------
//News--------------------------------------------------------------------------------------------------------------News
    @FindBy(xpath = "//a[@title='News']")
    private WebElement NewsButton;

    @FindBy(xpath = "//article[@id='post-55']")
    private WebElement NewsArticleMedFusion;

    @FindBy(xpath = "//article[@id='post-216']")
    private WebElement NewsArtliceLunaDNA;

    @FindBy(xpath = "//article[@id='post-228']")
    private WebElement NewsArticleHiTrust;

    public boolean NavigateToNewsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(NewsButton)).click();
        String ExpectedUrl = "https://greenlighthealth.com/blog/";
        String url = driver.driver().getCurrentUrl();
        boolean verify = (url.equals(ExpectedUrl));
        return verify;
    }

    public boolean NewsPageIsDisplayed(){
        boolean display1 = wait.until(ExpectedConditions.visibilityOf(NewsArticleMedFusion)).isDisplayed();
        boolean display2 = wait.until(ExpectedConditions.visibilityOf(NewsArtliceLunaDNA)).isDisplayed();
        boolean display3 = wait.until(ExpectedConditions.visibilityOf(NewsArticleHiTrust)).isDisplayed();
        if(display1 && display2 && display3){
            return true;
        } else {
            return false;
        }
    }
//News--------------------------------------------------------------------------------------------------------------News
//----------------------------------------------------------------------------------------------------------------------
//API Requests----------------------------------------------------------------------------------------------API Requests
    public void TestAPILandingPage(){
    }

    public void VerifyAPILandingPage(){
        given().when().get("https://greenlighthealth.com/").then().statusCode(is(200));
    }

    public void TestAPIAboutUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(AboutUsButton)).click();
    }

    public void VerifyAPIABoutUsPage(){
        given().when().get("https://greenlighthealth.com/about-us/").then().statusCode(is(200));
    }

    public void TestAPIContactUsPage(){
        actions.moveToElement(AboutUsButton).perform();
        wait.until(ExpectedConditions.elementToBeClickable(ContactUsButton)).click();
    }

    public void VerifyAPIContactUsPage(){
        given().when().get("https://greenlighthealth.com/contact-us/").then().statusCode(is(200));
    }

    public void TestAPIProductsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductsButton)).click();
    }

    public void VerifyAPIProductsPage(){
        given().when().get("https://greenlighthealth.com/solutions/").then().statusCode(is(200));
    }

    public void TestAPIPCareersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(CareersButton)).click();
    }

    public void VerifyAPICareersPage(){
        given().when().get("https://greenlighthealth.com/careers/").then().statusCode(is(200));
    }

    public void TestAPINewsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(NewsButton)).click();
    }

    public void VerifyAPINewsPage(){
        given().when().get("https://greenlighthealth.com/blog/").then().statusCode(is(200));
    }
//API Requests----------------------------------------------------------------------------------------------API Requests
//----------------------------------------------------------------------------------------------------------------------
}
