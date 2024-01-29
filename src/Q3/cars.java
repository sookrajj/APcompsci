package Q3;

public class cars extends vehicles {
  private double val;

  public cars(String name, int tires, double val) {
    super(name, tires, val);
    this.val = val;
  }

  public double getval() {return val;}
}
