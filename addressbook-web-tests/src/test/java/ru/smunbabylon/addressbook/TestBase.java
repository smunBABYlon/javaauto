package ru.smunbabylon.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase extends ApplicationManager {

  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    stop();
  }

}
