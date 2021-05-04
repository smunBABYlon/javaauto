package ru.smunbabylon.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void addNewGroup() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("abc", "abc", "abc"));
    submitGroupCreation();
    returnToGroupPage();
  }

}