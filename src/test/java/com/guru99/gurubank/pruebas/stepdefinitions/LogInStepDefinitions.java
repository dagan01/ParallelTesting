package com.guru99.gurubank.pruebas.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.guru99.gurubank.pruebas.models.Usuario;
import com.guru99.gurubank.pruebas.steps.InicioDeSesionSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LogInStepDefinitions {

	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;
	
	@Dado("^que estoy en la pagina de inicio de GuruBank$")
	public void queEstoyEnLaPaginaDeInicioDeGuruBank() {
		inicioDeSesionSteps.abrirGuruBank();
	}

	@Cuando("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> listaUsuario) {
		inicioDeSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
		inicioDeSesionSteps.escribirClave(listaUsuario.get(0).getClave());
		inicioDeSesionSteps.clickEnLogIn();
	}

	@Entonces("^valido la presencia de una alerta$")
	public void validoLaPresenciaDeUnaAlerta() throws InterruptedException {
		
		//Thread.sleep(4000);
	    assertThat(inicioDeSesionSteps.obtenerTextoDeAlerta(), Matchers.is("User or Password is not valid"));
	    //Thread.sleep(4000);
	    
	    
	}
	
}
