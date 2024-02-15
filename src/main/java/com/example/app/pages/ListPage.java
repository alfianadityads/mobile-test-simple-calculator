package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.Point;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void longPress() {
    AndroidElement element = find(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.isl.simpleapp:id/text_view\" and @text=\"List ke-5\"]"));
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter()))
            .waitAction(WaitOptions.waitOptions(
                    Duration.of(5, ChronoUnit.SECONDS))).release()
            .perform();
  }

//  public String listPopUpText() {
//    return getText(MobileBy.xpath("//android.widget.Toast[@text=\"List ke-10\"]"));
//  }

  public void swipeListMenuToListKe10() {
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().text(\"List ke-10\"))"));

  }

  public void multipleTaps() {
    AndroidElement element = find(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.isl.simpleapp:id/text_view\" and @text=\"List ke-10\"]"));
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(3).withElement(ElementOption.element(element))).perform();
  }

}
