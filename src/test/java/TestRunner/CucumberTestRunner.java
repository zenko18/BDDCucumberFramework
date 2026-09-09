package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/java/Feature"},
        glue = {"StepsDefinition"},
        plugin = {"pretty","html:target/htmlreport.html"} )
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
