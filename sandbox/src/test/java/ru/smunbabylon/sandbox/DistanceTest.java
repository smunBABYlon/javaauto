package ru.smunbabylon.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
  @Test
  public void testDistance(){
    Point p1 = new Point(0,0);
    Point p2 = new Point(3,4);
    Assert.assertEquals(p1.distance(p2), 5);
  }
}
