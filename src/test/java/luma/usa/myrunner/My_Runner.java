package luma.usa.myrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json"},
		features={".//Features/"},
		glue={"luma.usa.stepdefinations","luma.usa.hooks"},
		dryRun=false,
		//monochrome=true,
		tags="@sanity"
		
		)

public class My_Runner extends AbstractTestNGCucumberTests{

}
