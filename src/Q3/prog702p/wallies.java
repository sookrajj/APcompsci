package Q3.prog702p;

public class wallies extends Animals{
    private int mysteps;
    private static int allsteps = 0;
    private double average;
    private static int cnt = 0;

    public wallies(String name, String word, int steps) {
        super(name, word);
        mysteps = steps;
        average = 0;
        allsteps += steps;
        cnt++;
    }

    public void calc() {
        average = (double) allsteps/cnt;
    }

    public int getSteps() {return mysteps;}
    public double getAve() {return average;}
}
