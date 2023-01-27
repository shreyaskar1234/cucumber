package stepdefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstepdefinition {
	WebDriver driver;
	
	@Before("@ninja")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	   @Given("^I navigate to Login page of the Application$")
	    public void i_navigate_to_login_page_of_the_application() {
		   
		   driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		   
	   }
	   @When("^I enter emailaddress as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void i_enter_emailaddress_as_something_and_password_as_something_into_the_fields(String emailaddress, String password) {
		   
		   driver.findElement(By.id("input-email")).sendKeys(emailaddress);
		   driver.findElement(By.id("input-password")).sendKeys(password);
		  }
	   @And("^I click on Login button$")
	    public void i_click_on_login_button() {
		   
		   driver.findElement(By.cssSelector("input[value='Login']")).click();

	   }

	    @Then("^I the user should be able to successfully login$")
	    public void i_the_user_should_be_able_to_successfully_login() {
	    	
	    	
	    	WebElement accountBreadcrumb=null;
	    	try {
	    		
	    	
	     accountBreadcrumb= driver.findElement(By.xpath("//a[normalize-space()='Account']"));
	    	}catch(Exception e) {
	    		System.out.println("Login has FAILED");
	    		
	    	}
	    	Assert.assertNotEquals("Login has failed",accountBreadcrumb);

	    	
	    }
	    	@After("@ninja")
	    	public void close() {
	    		driver.quit();
	    		
	    	}

		
			
		}



