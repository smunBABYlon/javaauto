package ru.smunbabylon.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.smunbabylon.addressbook.model.UserData;

public class UserHelper extends HelperBase{

  public UserHelper(WebDriver driver) {
    super(driver);
  }

  public void submitUserForm() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillUserForm(UserData userData) {
    type(By.name("firstname"), userData.getName());
    type(By.name("lastname"), userData.getLastname());
    type(By.name("nickname"), userData.getNick());
    type(By.name("address"), userData.getAddress());
    type(By.name("home"), userData.getHomePhone());
    type(By.name("email"), userData.getEmail());
  }

  public void initUserModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitUserModification() {
    click(By.name("update"));
  }
}
