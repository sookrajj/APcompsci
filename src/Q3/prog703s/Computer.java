package Q3.prog703s;

public class Computer implements comps {
  private String name;
  private int number;
  private double value;

  public Computer(String name, int number, double value) {
    this.name = name;
    this.number = number;
    this.value = value;
  }

  public String getName() {return name;}
  public int getNumber() {return number;}
  public double getValue() {return value;}
}
