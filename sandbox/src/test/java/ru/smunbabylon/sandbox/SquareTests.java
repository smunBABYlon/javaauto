package ru.smunbabylon.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
@Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25);
  }

  @Test
  public void testDistance(){
  Point p1 = new Point(0,0);
  Point p2 = new Point(3,4);
  assert p1.distance(p2) == 5;
  }

}
