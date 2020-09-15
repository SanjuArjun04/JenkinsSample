package org.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepDefinition {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}

}
