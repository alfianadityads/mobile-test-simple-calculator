package com.example.steps;

import com.example.BaseTest;
import com.example.app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

//    @Given("a is {int}")
//    public void givenAIs(int value) {
//        a = value;
//    }
//
//    @Given("b is {int}")
//    public void givenBIs(int value) {
//        b = value;
//    }
//
//    @When("I add a and b")
//    public void iAddAAndB() {
//        total = calculator.add(a,b);
//    }
//
//    @Then("the total should be {int}")
//    public void theTotalShouldBe(int expectedTotal) {
//        assertThat(total).isEqualTo(expectedTotal);
//    }

//    Summation
    @And("user inputs Angka Satu as {string}")
    public void userInputsAngkaSatuAs(String AngkaSatu) {
        calculatorPage.inputAngkaSatu(AngkaSatu);
    }

    @When("user clicks dropdown operation menu")
    public void userClicksDropdownOperationMenu() {
        calculatorPage.clickDropdownOprMenu();
    }

    @And("user clicks sum operator")
    public void userClicksSumOperator() {
        calculatorPage.clickSumOperation();
    }

    @And("user inputs Angka Dua as {string}")
    public void userInputsAngkaDuaAs(String AngkaDua) {
        calculatorPage.inputAngkaDua(AngkaDua);
    }

    @When("user clicks calculate button")
    public void userClicksCalculateButton() {
        calculatorPage.clickCalculateBtn();
    }

    @Then("the result of summation operation should be correct")
    public void theTotalShouldBe() {
        String getText = calculatorPage.resultOperation();
        Assertions.assertEquals("Hasil : 5", getText);
    }

//    Subtraction

    @And("user clicks subtraction operator")
    public void userClicksSubtractionOperator() {
        calculatorPage.clickSubtractionOperation();
    }

    @Then("the result of subtraction operation should be correct")
    public void theResultOfSubtractionOperationShouldBeCorrect() {
        String getText = calculatorPage.resultOperation();
        Assertions.assertEquals("Hasil : 7", getText);
    }


//    Division
    @And("user clicks division operator")
    public void userClicksDivisionOperator() {
        calculatorPage.clickDivisionOperation();
    }

    @Then("the result of division operation should be correct")
    public void theResultOfDivisionOperationShouldBeCorrect() {
        String getText = calculatorPage.resultOperation();
        Assertions.assertEquals("Hasil : 4", getText);
    }



//    Multiplication
    @And("user clicks multiplication operator")
    public void userClicksMultiplicationOperator() {
        calculatorPage.clickMultiplication();
    }

    @Then("the result of multiplication operation should be correct")
    public void theResultOfMultiplicationOperationShouldBeCorrect() {
        String getText = calculatorPage.resultOperation();
        Assertions.assertEquals("Hasil : 21", getText);
    }
}
