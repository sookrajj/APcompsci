public class Apple extends Computers {
  private String color;


  public Apple(String name, int number, double value, String color) {
    super(name, number, value);
    this.color = color;

  }

  public String getColor() {return color;}
}
