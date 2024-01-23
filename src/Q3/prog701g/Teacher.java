package Q3.prog701g;

public class Teacher extends persons{
    private int mystuds;

    public Teacher(String fn, String ln, int studs) {
        super(fn, ln);
        mystuds = studs;
    }

    public int getStuds() {return mystuds;}
}
