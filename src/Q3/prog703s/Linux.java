package Q3.prog703s;

public class Linux extends Computer {
  private int code;

  public Linux(String name, int number, double value, int code) {
    super(name, number, value);
    this.code = code;
  }

  public int getCode() {return code;}
}
