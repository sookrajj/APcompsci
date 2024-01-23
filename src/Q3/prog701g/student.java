package Q3.prog701g;

public class student extends persons{
    private double myGPA;

    public student(String fn, String ln, double GPA) {
        super(fn, ln);
        myGPA = GPA;
    }

    public double getGPA() {return myGPA;}
}
