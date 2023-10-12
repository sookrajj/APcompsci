package Lang54bCl;

public class cl54a {
    private int mynum1;
    private int mynum2;
    private int mynum3;
    private int mynum4;
    private int mySum;
    private int myMean;


    public cl54a(int num1, int num2, int num3, int num4) {
        mynum1 = num1;
        mynum2 = num2;
        mynum3 = num3;
        mynum4 = num4;
        mySum = 0;
        myMean = 0;
    }

    public void calc() {
        mySum = mynum1 + mynum2 + mynum3 + mynum4;
        myMean = (mynum1 + mynum2 + mynum3 + mynum4) / 4;
    }

    public int getSum() {return mySum;}
    public int getMean() {return myMean;}

}
