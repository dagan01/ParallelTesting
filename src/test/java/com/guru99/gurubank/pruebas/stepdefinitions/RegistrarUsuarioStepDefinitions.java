package com.guru99.gurubank.pruebas.stepdefinitions;

import java.util.List;

import com.guru99.gurubank.pruebas.pageobjects.NewToursHomePageObject;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class RegistrarUsuarioStepDefinitions {

	NewToursHomePageObject newToursHome= new NewToursHomePageObject();
	
	@Dado("^ingresa al formulario de Register$")
	public void ingresaAlFormularioDeRegister() {
		newToursHome.clickEnRegister();
	}

	@Cuando("^ingresa la siguiente informacion del usuario nuevo:$")
	public void ingresaLaSiguienteInformacionDelUsuarioNuevo(List<String> arg1) {
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Entonces("^valida que aparezca un mensaje de bienvenida$")
	public void validaQueAparezcaUnMensajeDeBienvenida() {
	    
	}
	
}
