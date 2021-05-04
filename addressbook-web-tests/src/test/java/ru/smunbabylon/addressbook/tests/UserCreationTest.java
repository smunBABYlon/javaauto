package ru.smunbabylon.addressbook.tests;

import org.testng.annotations.Test;
import ru.smunbabylon.addressbook.model.UserData;

public class UserCreationTest extends TestBase {

  @Test
  public void addNewUser() throws Exception {
    app.getNavigationHelper().goToUserCreationPage();
    app.fillUserForm(new UserData("name", "lastname", "nick", "address", "89178193699", "a@b.ru"));
    app.submitUserForm();
    app.getNavigationHelper().goToHomePage();
  }

}
