package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOlaCabStepDef {



@Given("^User Navigates to the Corporate Ola Cabs URL$")
public void user_Navigates_to_the_Corporate_Ola_Cabs_URL() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
}

@When("^User Enters \"([^\"]*)\" in the Name field$")
public void user_Enters_in_the_Name_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^Verify if Name field allows only (\\d+) characters by comparing with \"([^\"]*)\"$")
public void verify_if_Name_field_allows_only_characters_by_comparing_with(int arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
}

}