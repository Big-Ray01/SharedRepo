package za.co.raytesting.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/test.feature",
//        plugin = "pretty",
        tags = "@test",
        glue = "za.co.raytesting.Steps"
)
public class Runner {
}
