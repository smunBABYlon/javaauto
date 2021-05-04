package ru.smunbabylon.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.smunbabylon.addressbook.model.UserData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  WebDriver driver;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void stop() {
    driver.quit();
  }

  public void goToHomePage() {
    driver.findElement(By.linkText("home page")).click();
  }

  public void submitUserForm() {
    driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void fillUserForm(UserData userData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(userData.getName());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(userData.getLastname());
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).clear();
    driver.findElement(By.name("nickname")).sendKeys(userData.getNick());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(userData.getAddress());
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys(userData.getHomePhone());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(userData.getEmail());
  }

  public void goToUserCreationPage() {
    driver.findElement(By.linkText("add new")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
