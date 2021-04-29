package ru.smunbabylon.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world");
    hello("кисоньке", "маракуйи", 4);
    hello("мне", "яблока", 2);
    String proba = hello("kate", "Apples", 8);
    System.out.println(proba);
    System.out.println(hello("kate", "Apples", 5));
    Square s = new Square(5);
    Rectangle r = new Rectangle(6,7);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());
    System.out.println("Площадь прямоугольника " + "равна " + r.area());
  }

  public static String hello(String somebody, String something, int HowMuch){
    //System.out.println("Дайте " + somebody + " " + HowMuch + " " + something);
    return "Дайте " + somebody + " " + HowMuch;
  }



}