package Q3.prog702q;

public class vehicles implements vnames {
  private String name;
  private int tires;
  private double val;

  public vehicles(String name, int tires, double val) {
    this.name = name;
    this.tires = tires;
    this.val = val;
  }

  public String getName() {return name;}
  public int getTires() {return tires;}
  public double getValue() {return val;}
}
