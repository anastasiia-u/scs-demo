package cucumberdefinitions;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import core.Browser;
import io.cucumber.java.AfterAll;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumberdefinitions")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "cucumberdefinitions")
public class CucumberRunner {
    @AfterAll
    public static void before_or_after_all() {
        Browser.getDriver().quit();
    }
}
