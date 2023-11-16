package Q2.test;

public class testcl {
    private int[] test = new int[30];
    private int t;

    public testcl(int pop) {
        t = 0;
        test[t] = pop;

        t++;
    }

    public int[] getT() {return test;}
}
