package com.guru99.gurubank.pruebas.steps;

import static com.guru99.gurubank.pruebas.utilities.UtilidadesExcel.agregarNuevaFilaDeDatos;

import com.guru99.gurubank.pruebas.pageobjects.AlertaPageObject;
import com.guru99.gurubank.pruebas.utilities.UtilidadesExcel;

import net.thucydides.core.annotations.Step;

public class AlertaSteps {

	AlertaPageObject alertaPOM=new AlertaPageObject();
	
	@Step
	public void openApplicationWithAlerts() {
		alertaPOM.open();
		UtilidadesExcel.sobreescribirExcel("C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx", "Ejecucion 2");
	}
	
	@Step
	public void clickOnBtnAlert() {
		agregarNuevaFilaDeDatos("SKUALERTA", "la alerta de pachito es el error", 
				"https://alertakase.com", 
				"C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx","Ejecucion 2");
		alertaPOM.clickOnBtnAlert();
	}
	
	@Step
	public String getTextFromAlert() {
		agregarNuevaFilaDeDatos("skutextoalerta", "el texto de la alerta de pachito es el error", 
				"https://texticokase.com", 
				"C:\\Users\\Usuario\\eclipse-workspace\\SofitosWorkspace\\Reto1\\Pachito.xlsx","Ejecucion 2");
		return alertaPOM.getTextFromAlert();
	}
	
	@Step
	public void acceptTheAlert() {
		alertaPOM.acceptTheAlert();
	}
	
}
