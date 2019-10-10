package rr.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\RAHUL3054\\Selenium\\cucumber\\src\\test\\java\\Rp.feature",
                 tags= "@ProductTest")
public class RpTestRunner {

}
