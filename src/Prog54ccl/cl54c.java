package Prog54ccl;

public class cl54c {
  private double rad;
  private double pie;
  private double area;
  private double cir;

  public cl54c(double radius) {
    rad = radius;
    pie = 3.14159;
    area = 0;
    cir = 0;
  }

  public void calc() {
    cir = pie * rad * 2;
    area = pie * Math.pow(rad, 2);
  }

  public double getArea() {return area;}
  public double getCircumference() {return cir;}
  public double getRadius() {return rad;}
}
