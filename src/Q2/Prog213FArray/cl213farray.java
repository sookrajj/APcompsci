package Q2.Prog213FArray;

public class cl213farray {
    private double mykwh;
    private double mycost;

    public cl213farray(int kwh) {
        mykwh = kwh;
        mycost = 0;
    }

    public void calc() {
        if (mykwh < 2000) mycost = mykwh * 0.07;
        else if (mykwh< 10000) mycost = (mykwh-2000) * 0.05 + 2000 * 0.07;
        else mycost = (mykwh-10000) * 0.04 + 8000 * 0.05 + 2000 * 0.07;
    }

    public String toString() {
        return "the number of " + mycost;
    }
}
