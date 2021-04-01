package Greenlight.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        tags = "",
        publish = true,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "timeline:target/timeline-report"
        },
        features = {
                "src/test/resources/features"
        },
        glue = "Greenlight/StepDefinitions"
)
public class CucumberRunner {}