package ru.smunbabylon.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void goToGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void goToHomePage() {
    driver.findElement(By.linkText("home page")).click();
  }

  public void goToUserCreationPage() {
    driver.findElement(By.linkText("add new")).click();
  }
}
