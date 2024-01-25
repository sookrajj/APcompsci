package Q3.prog702p;

public class hiccas extends Animals{
    private double furcost;
    private static double allfur = 0;
    private double average;
    private static int cnt = 0;

    public hiccas(String name, String word, double fur) {
        super(name, word);
        furcost = fur;
        average = 0;
        allfur += fur;
        cnt++;
    }

    public void calc() {
        average = allfur/ (double)cnt;
    }

    public double getfur() {return furcost;}
    public double getAve() {return average;}
}
