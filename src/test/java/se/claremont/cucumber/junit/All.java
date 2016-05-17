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
        features = "src/test/resources/",
        glue = "se.claremont"
)
public class All {
}
