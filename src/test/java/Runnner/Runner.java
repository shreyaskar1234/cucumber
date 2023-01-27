package Runnner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target/cucmber_html_report.html"},
		
		features="src/test/java/features/",
		glue="stepdefinitions",
		tags="@ninja"
	 
		
		)    // add tag Smoke or any other test to do specific test tag=smokeTest
                                  //(and add it on features which u want to execute
public class Runner {               //tag is user defined u can write anything

	
}
