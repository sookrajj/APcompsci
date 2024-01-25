package Q3.prog702p;

public class beepers extends Animals{
    private String myfav;
    private static String allfav = "";
    private double ave;
    private static int cnt = 0;

    public beepers(String name, String word, String fav) {
        super(name, word);
        myfav = fav;
        allfav += fav;
        cnt++;
        ave = 0;
    }

    public void calc() {
        ave = (double) allfav.length()/(double) cnt;
    }

    public String getfav() {return myfav;}
    public double getAve() {return ave;}
}
