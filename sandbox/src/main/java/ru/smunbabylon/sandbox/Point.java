package ru.smunbabylon.sandbox;

public class Point {
  public double x;
  public double y;

  public Point (double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance(Point AnotherPoint) {
    double xx = this.x - AnotherPoint.x;
    double yy = this.y - AnotherPoint.y;
    double s = xx * xx + yy * yy;
    return Math.sqrt(s);
  }

}
