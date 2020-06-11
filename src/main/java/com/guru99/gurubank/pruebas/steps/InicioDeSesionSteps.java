package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.pageobjects.InicioDeSesionPageObject;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {
	
	InicioDeSesionPageObject inicioDeSesionPOM=new InicioDeSesionPageObject();
	
	@Step
	public void abrirGuruBank() {
		inicioDeSesionPOM.open();
	}
	
	@Step
	public void escribirUsuario(String usuario) {
		inicioDeSesionPOM.escribirUsuario(usuario);
	}
	
	@Step
	public void escribirClave(String clave) {
		inicioDeSesionPOM.escribirClave(clave);
	}
	
	@Step
	public void clickEnLogIn() {
		inicioDeSesionPOM.clickEnLogIn();
	}
	
	@Step
	public String obtenerTextoDeAlerta() {
		return inicioDeSesionPOM.obtenerTextoDeAlerta();
	}
	
}
