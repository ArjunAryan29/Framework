package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import utility.BrowserDriver;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,features= "src/test/java/features/uspsF.feature",
        glue={"StepDefinition","hooks"},
        plugin={"pretty","html:target/cucumber-html-report","json:cucumber.json"},
        monochrome = true
)
public class TestRunner extends BrowserDriver {

}