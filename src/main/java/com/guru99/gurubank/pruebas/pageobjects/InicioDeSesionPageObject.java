package com.guru99.gurubank.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class InicioDeSesionPageObject extends PageObject {

	By txtUserID = By.name("uid");
	By txtClave = By.name("password");
	By btnLogIn = By.name("btnLogin");

	public void escribirUsuario(String usuario) {
		getDriver().findElement(txtUserID).sendKeys(usuario);
	}

	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);
	}

	public void clickEnLogIn() {
		getDriver().findElement(btnLogIn).click();

	}

	public String obtenerTextoDeAlerta() {
		// Alert alert =getDriver().switchTo().alert();

		return getAlert().getText();
	}

}
