package co.com.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= "src/test/resources/features/registro_usuario.feature",
        tags= "@stories",
        glue= "co.com.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}


