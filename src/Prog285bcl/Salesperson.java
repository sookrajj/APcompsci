package Prog285bcl;

public class Salesperson {
    private int myid;
    private int mycode;
    private double mysales;
    private double mycom;

    private void calc() {
        if (mycode == 5 || mycode == 8) {
            if (mysales <= 5000)
                mycom = getsales() * 0.075;
            else
                mycom = 5000 * 0.075 + (mysales - 5000) * 0.075;
        } else if (mycode == 17) {
            if (mysales <= 3500)
                mycom = mysales * 0.095;
            else
                mycom = 3500 * 0.095 + (getsales() - 3500) * 0.12;

        }
    }

    public Salesperson(int id, int code, double sales) {
        myid = id;
        mycode = code;
        mysales = sales;
        mycom = 0;
    }

    public void setcom() { calc(); }

    public int getid() {return myid; }
    public int getcode() {return mycode; }
    public double getcom() {return mycom; }
    public double getsales() {return mysales; }

    public String toString() {
        return myid + "\t" + mycode + "\t" + mysales + "\t" + mycom;
    }


}
