public class Linux extends Computers {
  private int code;

  public Linux(String name, int number, double value, int code) {
    super(name, number, value);
    this.code = code;
  }

  public int getCode() {return code;}
}
