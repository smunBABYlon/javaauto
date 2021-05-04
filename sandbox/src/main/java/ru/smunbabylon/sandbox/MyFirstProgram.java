package ru.smunbabylon.sandbox;

import java.util.Scanner;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("кисоньке", "маракуйи", 4);
    hello("мне", "яблока", 2);
    String proba = hello("kate", "Apples", 8);
    System.out.println(proba);
    System.out.println(hello("kate", "Apples", 5));
    System.out.println("введите сторону квадрата");
    Scanner squareSide = new Scanner(System.in);
    Square s = new Square(squareSide.nextDouble());
    Rectangle r = new Rectangle(6,7);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());
    System.out.println("Площадь прямоугольника " + "равна " + r.area());


    Point a = new Point(-2,-5);
    Point b = new Point(1,-1);
    System.out.println(a.distance(b));
  }

  public static String hello(String somebody, String something, int HowMuch){
    //System.out.println("Дайте " + somebody + " " + HowMuch + " " + something);
    return "Дайте " + somebody + " " + HowMuch;
  }


  }



