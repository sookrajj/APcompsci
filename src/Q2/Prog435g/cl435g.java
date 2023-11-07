package Q2.Prog435g;

public class cl435g {

    private int myscore;
    private int myrank;

    public cl435g(int score) {
        myscore = score;
        myrank = 0;
    }

    public void setRank(int rank) { myrank = rank; }
    public String toString() { return myscore + "\t\t" + myrank; }
}
