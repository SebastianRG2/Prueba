package com.sophossolutions.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/sophossolutions/features/buy_cart.feature",
        glue = "com.sophossolutions.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BuyCart {
}
