package ru.smunbabylon.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTest extends TestBase{
  @Test
  public void testUserDeletion(){
    app.getUserHelper().selectUser();
    app.getUserHelper().deleteSelectedUsers();
    app.getNavigationHelper().popupConfirm();
    app.getNavigationHelper().goHome();
  }
}
