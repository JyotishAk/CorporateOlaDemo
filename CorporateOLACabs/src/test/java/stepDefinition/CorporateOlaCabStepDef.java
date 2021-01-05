package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class CorporateOlaCabStepDef {

	WebDriver driver = hooks.driver;

@Given("^User Navigates to the Corporate Ola Cabs URL$")
public void user_Navigates_to_the_Corporate_Ola_Cabs_URL() throws Throwable {
    driver.get("https://corporate.olacabs.com/#/contact");
}

@Then("^User click on contact Info$")
public void user_click_on_contact_Info() throws Throwable {
    driver.findElement(By.id("link-contact")).click();
}

@When("^User Enters \"([^\"]*)\" in the Name field$")
public void user_Enters_in_the_Name_field(String arg1) throws Throwable {
	driver.findElement(By.id("email43")).sendKeys(arg1);
}

@Then("^Verify if Name field allows only (\\d+) characters by comparing with \"([^\"]*)\"$")
public void verify_if_Name_field_allows_only_characters_by_comparing_with(int arg1, String arg2) throws Throwable {
	String name = driver.findElement(By.id("email43")).getText();
	if(name != arg2) {
		System.out.println("It allows only 100 characters");
	}	
}

@Then("^Provide Email Address \"([^\"]*)\"$")
public void provide_Email_Address(String arg1) throws Throwable {
	driver.findElement(By.name("email")).sendKeys(arg1);
}

@Then("^Give Company Name \"([^\"]*)\"$")
public void give_Company_Name(String arg1) throws Throwable {
	driver.findElement(By.name("corporate_name")).sendKeys(arg1);
}




}