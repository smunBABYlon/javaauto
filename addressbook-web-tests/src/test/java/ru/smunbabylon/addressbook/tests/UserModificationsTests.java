package ru.smunbabylon.addressbook.tests;

import org.testng.annotations.Test;
import ru.smunbabylon.addressbook.model.UserData;

public class UserModificationsTests extends TestBase{
  @Test
  public void testUserModification(){
    app.getUserHelper().initUserModification();
    app.getUserHelper().fillUserForm(new UserData("Nataliya", "Tslav", "may_lee", "address", "892729090103", "a@c.ru"));
    app.getUserHelper().submitUserModification();
    app.getNavigationHelper().goToHomePage();
  }
}
