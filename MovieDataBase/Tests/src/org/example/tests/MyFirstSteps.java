package org.example.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstSteps {
    WebDriver webDriver = new FirefoxDriver();
    WebElement archiveLink;
    WebElement searchImput;


    @Given("I am on the homepage")
    public void I_am_on_the_homepage(){
        webDriver.get("https://www.themoviedb.org/");
    }

    @Given("Cursor is in search field and type Barbie")
        public void cursor_is_in_search_field_and_type_Barbie () {
        searchImput= webDriver.findElement(By.cssSelector("#inner_search_v4"));
        WebElement searchInput = webDriver.findElement(By.cssSelector("input#inner_search_v4"));

        searchInput.sendKeys("Barbie");


        }


    @When("I click search button")
    public void I_click_search_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement searchInput2 = webDriver.findElement(By.cssSelector("input[type='submit'][value='Search']"));
        //searchInput2.sendKeys(Keys.RETURN);
        searchInput2.click();

    }

    @Then("result showing Barbie")
    public void result_showing_Barbie() {

        WebElement firstSearch = webDriver.findElement(By.xpath("//h2[contains(text(),'Barbie')]"));

//        String actualResult = firstSearch.getText();
//        // Expected result
//        String expectedResult = "Titanic";
//        assertEquals(expectedResult, actualResult);

    }

//   @After
//    public void CleanUp() {
//       webDriver.close();
//   }





}
