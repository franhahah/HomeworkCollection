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
// check of int1 >=0
// Yess oke
    // nee Illegalargument

    @Given("I have {int} water bottles")
    public void i_have_water_bottles(int int1) {
        fridge = new Fridge(int1);
    }


// hier wordt dezelfde variabele gebuikt int1 voor have an int1 voor drunk???

    @Given("I have drunk {int} water bottles")
    public void i_have_drunk_water_bottles(int int1) {
        fridge.Take(int1);
    }

    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
        remainingBottles = fridge.getStock();

    }
// int1 is toch begin waarde, er moet iets anders vergeleken worden
    @Then("I should have {int} water bottles")
    public void i_should_have_water_bottles(int int1) {
        Assert.assertEquals(int1, remainingBottles);



    }
}