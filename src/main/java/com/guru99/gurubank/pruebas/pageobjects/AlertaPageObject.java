package com.guru99.gurubank.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html")
public class AlertaPageObject extends PageObject {

	By btnAlert = By.xpath("//button[@class='btn btn-default']");

	public void clickOnBtnAlert() {
		getDriver().findElement(btnAlert).click();
	}
	
	public String getTextFromAlert() {
		System.out.println("The text gotten with the driver is: "+getDriver().switchTo().alert().getText());
		return getAlert().getText();
	}
	
	public void acceptTheAlert() {
		getAlert().accept();
	}

}
