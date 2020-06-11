package com.guru99.gurubank.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")
public class NewToursHomePageObject extends PageObject {

	By txtUserName = By.name("userName");
	By txtPassword = By.name("password");
	By btnLogin = By.name("login");
	By btnSignOff = By.xpath("//a[text()='SIGN-OFF']");
	By btnSignOn = By.xpath("//a[text()='SIGN-ON']");
	By btnRegister = By.xpath("//a[text()='REGISTER']");

	public void clickEnRegister() {
		getDriver().findElement(btnRegister).click();
	}

	public void escribirUsuario(String usuario) {
		getDriver().findElement(txtUserName).sendKeys(usuario);
	}

	public void escribirClave(String clave) {
		getDriver().findElement(txtPassword).sendKeys(clave);
	}

	public void clickEnLogIn() {
		getDriver().findElement(btnLogin).click();
	}

	public boolean presenciaDelBotonSignOff() {
		return getDriver().findElement(btnSignOff).isDisplayed();
	}

	public boolean presenciaDelBotonSignOn() {
		return getDriver().findElement(btnSignOn).isDisplayed();
	}

}
