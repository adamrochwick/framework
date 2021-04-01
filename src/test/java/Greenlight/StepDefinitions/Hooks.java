package Greenlight.StepDefinitions;

import Greenlight.Util.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        driver.driver().manage().window().maximize();
        driver.driver().get("https://greenlighthealth.com");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) driver.driver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
    }
}
