package Q2.prog435acl;

public class cl435a {
  private int myctype;
  private int mygate;
  private double mycost;
  private double[] gnums = new double[8];
  private double[] cnums = new double[6];
  private String[] ct = new String[6];


  public cl435a(int ctype, int gate) {
    myctype = ctype;
    mygate = gate;
    mycost = 0.0;
    gnums[0] = 1.35;
    gnums[1] = 2;
    gnums[2] = 2.5;
    gnums[3] = 3.25;
    gnums[4] = 4.1;
    gnums[5] = 4.8;
    gnums[6] = 5.5;
    gnums[7] = 6;
    cnums[0] = 1;
    cnums[1] = 1.3;
    cnums[2] = 1.6;
    cnums[3] = 2;
    cnums[4] = 2.4;
    cnums[5] = 2.7;
    ct[0] = "compact car";
    ct[1] = "small car";
    ct[2] = "medium size car";
    ct[3] = "full size car";
    ct[4] = "truck";
    ct[5] = "16 wheeler";
  }

  public void calc() {
    mycost = gnums[mygate - 1] * cnums[myctype - 1];
  }

  public String toString() {
    return ct[myctype - 1] + "\t$" + cnums[myctype - 1] + "\t$" + gnums[mygate - 1] + "\t$" + mycost;

  }
}
