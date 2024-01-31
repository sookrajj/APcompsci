package Q3.prog703s;

public class Apple extends Computer {
  private String color;


  public Apple(String name, int number, double value, String color) {
    super(name, number, value);
    this.color = color;

  }

  public String getColor() {return color;}
}
