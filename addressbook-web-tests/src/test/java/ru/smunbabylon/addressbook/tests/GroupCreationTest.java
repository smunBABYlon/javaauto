package ru.smunbabylon.addressbook.tests;

import org.testng.annotations.*;
import ru.smunbabylon.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void addNewGroup() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("abc", "abc", "abc"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}