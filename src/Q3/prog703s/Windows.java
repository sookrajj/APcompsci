package Q3.prog703s;

public class Windows extends Computer {
  private double ver;

  public Windows(String name, int number, double value, double ver) {
    super(name, number, value);
    this.ver = ver;
  }

  public double getVer() {return ver;}
}
