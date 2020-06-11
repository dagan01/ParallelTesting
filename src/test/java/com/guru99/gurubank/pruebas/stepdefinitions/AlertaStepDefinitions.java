package com.guru99.gurubank.pruebas.stepdefinitions;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import com.guru99.gurubank.pruebas.steps.AlertaSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AlertaStepDefinitions {

	@Steps
	AlertaSteps alertaSteps;
	
	@Given("^I go to an alert WebPage$")
	public void i_go_to_an_alert_WebPage() {
		alertaSteps.openApplicationWithAlerts();
	}

	@When("^I click on an alert$")
	public void i_click_on_an_alert() {
		alertaSteps.clickOnBtnAlert();
	}

	@Then("^I validate the text and accept the alert$")
	public void i_validate_the_text_and_accept_the_alert() {
		
		assertThat(alertaSteps.getTextFromAlert(), Matchers.is("I am an alert box!"));
		alertaSteps.acceptTheAlert();
	}
	
}
