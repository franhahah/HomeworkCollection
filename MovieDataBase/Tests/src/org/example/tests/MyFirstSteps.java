package org.example.tests;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;


public class MyFirstSteps {
    WebDriver webDriver = new FirefoxDriver();
    WebElement archiveLink;
    WebElement searchInput;


    @Given("I am on the homepage")
    public void I_am_on_the_homepage(){
        webDriver.get("https://www.themoviedb.org/");
    }

    @Given("Cursor is in search field and type Barbie")
        public void cursor_is_in_search_field_and_type_Barbie () {
        searchInput= webDriver.findElement(By.cssSelector("#inner_search_v4"));

        //WebElement searchInput = webDriver.findElement(By.cssSelector("input#inner_search_v4"));

        searchInput.sendKeys("Barbie");
        }


    @When("I click search button")
    public void I_click_search_button() {
        // WebElement searchInput2 = webDriver.findElement(By.cssSelector("input[type='submit'][value='Search']"));

        WebElement searchInput2 = webDriver.findElement(By.cssSelector("#inner_search_form > input[type=submit]"));

        searchInput2.click();

    }

    @Then("result showing Barbie")
    public void result_showing_Barbie() {

        WebElement firstSearch = webDriver.findElement(By.xpath("//h2[contains(text(),'Barbie')]"));

        String actualResult = firstSearch.getText();
        // Expected result
        String expectedResult = "Barbie";
        assertEquals (expectedResult, actualResult);

    }
   @After
    public void CleanUp() {
       webDriver.close();
   }

}
