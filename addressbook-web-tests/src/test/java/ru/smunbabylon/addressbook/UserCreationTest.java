package ru.smunbabylon.addressbook;

import org.testng.annotations.Test;

public class UserCreationTest extends TestBase {

  @Test
  public void addNewUser() throws Exception {
    goToUserCreationPage();
    fillUserForm(new UserData("name", "lastname", "nick", "address", "89178193699", "a@b.ru"));
    submitUserForm();
    goToHomePage();
  }

}
