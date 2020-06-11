package com.guru99.gurubank.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com\\guru99\\gurubank\\pruebas\\features\\Alerta.feature", glue = "com.guru99.gurubank.pruebas.stepdefinitions", snippets = SnippetType.CAMELCASE)
public class AlertaRunner {

}
