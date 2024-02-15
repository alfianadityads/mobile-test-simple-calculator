package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

//  ============ Long Press ================
  @And("user do long press in five seconds in List ke-lima")
  public void userDoLongPressInSecondsInListKe() {
    listPage.longPress();
  }

//  ============ Multiple Taps ================
  @And("user do scroll until to List ke-sepuluh")
  public void userDoScrollUntilToListKeSepuluh() {
    listPage.swipeListMenuToListKe10();
  }

  @Then("user do multiple taps three time in List ke-sepuluh")
  public void userDoMultipleTapsThreeTimeInListKeSepuluh() {
    listPage.multipleTaps();
  }
}
