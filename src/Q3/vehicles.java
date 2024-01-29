package Q3;

public class vehicles implements vnames {
  private String name;
  private int tires;
  private double val;

  public vehicles(String name, int tires, double val) {
    this.name = name;
    this.tires = tires;
    this.val = val;
  }

  public String getname() {return name;}
  public int gettires() {return tires;}
  public double getval() {return val;}
}
