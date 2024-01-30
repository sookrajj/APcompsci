package Q3.prog702q;

public class bus extends vehicles {
  private String home;

  public bus(String name, int tires, double val, String home) {
    super(name, tires, val);
    this.home = home;
  }

  public String gethome() {return home;}
}
