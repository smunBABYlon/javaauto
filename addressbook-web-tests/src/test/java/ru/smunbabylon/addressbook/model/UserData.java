package ru.smunbabylon.addressbook.model;

public class UserData {
  private final String name;
  private final String lastname;
  private final String nick;
  private final String address;
  private final String homePhone;
  private final String email;

  public UserData(String name, String lastname, String nick, String address, String homePhone, String email) {
    this.name = name;
    this.lastname = lastname;
    this.nick = nick;
    this.address = address;
    this.homePhone = homePhone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNick() {
    return nick;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getEmail() {
    return email;
  }
}
