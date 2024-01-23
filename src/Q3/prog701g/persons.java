package Q3.prog701g;

public class persons implements names {
    private String myFirst;
    private String myLast;

    public persons(String fn, String ln) {
        myFirst = fn;
        myLast = ln;
    }

    public String getFirst() {return myFirst;}
    public String getLast() {return myLast;}
    public String getName() {return myFirst + " " + myLast;}


}
