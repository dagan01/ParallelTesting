package com.guru99.gurubank.pruebas.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.guru99.gurubank.pruebas.pageobjects.NewToursHomePageObject;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class IniciarSesionStepDefinitions {

	NewToursHomePageObject newToursHomePage=new NewToursHomePageObject();
	
	@Dado("^que David ingresa a la pagina Home de NewTours$")
	public void queDavidIngresaALaPaginaHomeDeNewTours() {
		newToursHomePage.open();
	}

	@Cuando("^ingresa las siguientes credenciales$")
	public void ingresaLasSiguientesCredenciales(List<String> listaUsuario) {
		newToursHomePage.escribirUsuario(listaUsuario.get(0));
		newToursHomePage.escribirClave(listaUsuario.get(1));
		newToursHomePage.clickEnLogIn();
	}

	@Entonces("^valida que aparezca el boton SING-OFF$")
	public void validaQueAparezcaElBotonSINGOFF() {
		assertThat(newToursHomePage.presenciaDelBotonSignOff(), Matchers.is(true));
	}

	@Entonces("^valida que aparezca el boton SING-ON$")
	public void validaQueAparezcaElBotonSINGON() {
		assertThat(newToursHomePage.presenciaDelBotonSignOn(), Matchers.is(true));
	}
	
}
