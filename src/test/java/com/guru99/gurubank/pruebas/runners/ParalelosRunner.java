package com.guru99.gurubank.pruebas.runners;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import net.serenitybdd.cucumber.CucumberWithSerenity;


public class ParalelosRunner {

	@Test
    public void runAllTests() {
        Class<?>[] classes = {IniciarSesionRunner2.class,AlertaRunner.class};
 
        // ParallelComputer(true,true) will run all classes and methods
        // in parallel.  (First arg for classes, second arg for methods)
        // I set true, true this means classes and methods runs in parallel.
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
	
}
