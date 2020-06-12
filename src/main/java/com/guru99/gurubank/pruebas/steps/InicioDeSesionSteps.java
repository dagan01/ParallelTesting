package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.pageobjects.InicioDeSesionPageObject;
import com.guru99.gurubank.pruebas.utilities.UtilidadesExcel;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {
	
	InicioDeSesionPageObject inicioDeSesionPOM=new InicioDeSesionPageObject();
	
	@Step
	public void abrirGuruBank() {
		UtilidadesExcel.sobreescribirExcel("C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx", "Ejecucion 1");
		inicioDeSesionPOM.open();
	}
	
	@Step
	public void escribirUsuario(String usuario) {
		
		inicioDeSesionPOM.escribirUsuario(usuario);
		UtilidadesExcel.agregarNuevaFilaDeDatos("SKUSUARI", "El usuario de pachito es el error", 
				"https://olakase.com", 
				"C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx","Ejecucion 1");
	}
	
	@Step
	public void escribirClave(String clave) {
		inicioDeSesionPOM.escribirClave(clave);
		UtilidadesExcel.agregarNuevaFilaDeDatos("SKUClave", "La clave de pachito es el error", 
				"https://clavekase.com", 
				"C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx","Ejecucion 1");
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
