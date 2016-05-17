package se.claremont.cucumber.junit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by cla_johbac on 2016-04-15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:build/cucumber/test-reports/all.json",
                "html:build/cucumber/html/"
        },
        features = "src/test/resources/",
        glue = "se.claremont"
)
public class All {
}
