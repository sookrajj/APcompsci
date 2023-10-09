package Lang54bCl;

public class cl54a {
    private int mynum1;
    private int mynum2;
    private int mynum3;
    private int mynum4;



    public Lang54bCl(int num1, int num2, int num3, int num4) {
        mynum1 = num1;
        mynum2 = num2;
        mynum3 = num3;
        mynum4 = num4;
    }

    public void calc() {
        sum = mynum1 + mynum2 + mynum3 + mynum4;
        mean = (mynum1 + mynum2 + mynum3 + mynum4) / 4;
    }

    public int getSum() {return sum;}
    public int getMean() {return mean;}
}
