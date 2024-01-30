package Q3.prog702q;

public class cars extends vehicles {
  private double val;

  public cars(String name, int tires, double val) {
    super(name, tires, val);
    this.val = val;
  }

  public double getValue() {return val;}
}
