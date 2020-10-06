package com.sophossolutions.stepdefinitions;

import com.sophossolutions.exceptions.ExceptionError;
import com.sophossolutions.tasks.BuyProduct;
import com.sophossolutions.utilities.MsgError;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class BuyCartStepDefinitions {
    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Web user");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.wong.pe/especiales/cyberwong"));
    }

    /*@Given("{word} select the {string}")
    public void selectThe(String actorName, String article) {
        theActorCalled(actorName).attemptsTo(BuyProduct.buy());
    }

    @When("Add to shopping cart the {string}")
    public void addToShoppingCartThe(String string) {
        System.out.println(string);
    }

    @Then("Check if the product was added to the cart {string}")
    public void checkIfTheProductWasAddedToTheCart(String string) {
        theActorInTheSpotlight().should(seeThat(BuyProduct.name(), equalTo(string))
                .orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
    }*/

    @Given("^Candidate select the <article>$")
    public void candidateSelectTheArticle() {
    }

    @When("^Add to shopping cart the <product>$")
    public void addToShoppingCartTheProduct() {
    }

    @Then("^Check if the product was added to the cart <product>$")
    public void checkIfTheProductWasAddedToTheCartProduct() {
    }
}
