package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(tags = "",
            plugin = {"pretty", "html:target/cucumber"},
            features = "src/test/resources/features/main.feature",
            glue = "stepDefinition"
           )

    public  class CucumberRunnerTests {

    }

