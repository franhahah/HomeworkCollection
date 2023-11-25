package org.example.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Fridge;
import org.junit.Assert;

public class StepDefinitions {
    private Fridge fridge;

    private int remainingBottles;

    @Given("I have {int} water bottles")
    public void i_have_water_bottles(int totalBottles) {
        fridge = new Fridge(totalBottles);
    }


    @Given("I have drunk {int} water bottles")
    public void i_have_drunk_water_bottles(int drunkBottles) {
        fridge.Take(drunkBottles);

    }

    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
        remainingBottles = fridge.getStock();

    }

    @Then("I should have {int} water bottles")
    public void i_should_have_water_bottles(int expBottles) {
        Assert.assertEquals(expBottles, remainingBottles);
    }
}