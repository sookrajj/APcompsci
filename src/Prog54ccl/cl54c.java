package Prog54ccl;

public class cl54c {
  private double rad;
  private double pie;

  public cl54c(int radius) {
    rad = radius;
    pie = 3.14159;
  }

  public void calc() {
    double cir = pie * rad * 2;
    double area = pie * Math.pow(rad, 2);
  }

  public double getArea() {return area;}
  public double getCircumference() {return cir;}
  public double getRadius() {return rad;}
}
