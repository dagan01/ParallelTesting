package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.pageobjects.AlertaPageObject;

import net.thucydides.core.annotations.Step;

public class AlertaSteps {

	AlertaPageObject alertaPOM=new AlertaPageObject();
	
	@Step
	public void openApplicationWithAlerts() {
		alertaPOM.open();
	}
	
	@Step
	public void clickOnBtnAlert() {
		alertaPOM.clickOnBtnAlert();
	}
	
	@Step
	public String getTextFromAlert() {
		return alertaPOM.getTextFromAlert();
	}
	
	@Step
	public void acceptTheAlert() {
		alertaPOM.acceptTheAlert();
	}
	
}
