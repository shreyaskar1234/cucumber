package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {
	
	WebDriver driver;
	
	
	@Before("@Login")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
@Given("^I navigate to application URL$")
public void I_navigate_to_application_URL() {
	
	
	driver.get("http://omayo.blogspot.com/");
}
@When("^I enter Username as (.+) and Password as (.+) into the field$")
public void i_enter_username_as_and_password_as_into_the_field(String someusername, String somepassword) {

	driver.findElement(By.name("userid")).sendKeys(someusername);
	driver.findElement(By.name("pswrd")).sendKeys(somepassword);
}
@And("^I click to Login button$")
public void i_click_to_login_button() {
	driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();  
}
@Then("^User should be able to login based on (.+) login status$")
public void user_should_be_able_to_login_based_on_expeced_login_status(String expectedLoginStatus) {
	
	
	String actualStatus=null;
	try {
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		if(actualText.equals("Error Password or Username")) {
			actualStatus="failure";
		}else {
			actualStatus="success";
		}
	
	}
	catch(Exception e) {
		actualStatus="success";		
	}
	

	Assert.assertEquals(expectedLoginStatus, actualStatus);
	
}


@After("Login")
public void tearDown()
{
	driver.quit();
}
}



