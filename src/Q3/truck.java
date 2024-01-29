package Q3;

public class truck extends vehicles {
  private double mileage;

  public truck(String name, int tires, double val, double miles) {
    super(name, tires, val);
    mileage = miles;
  }


  public double getmileage() {return mileage;}
  
}

  
