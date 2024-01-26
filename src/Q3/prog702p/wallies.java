package Q3.prog702p;

public class wallies extends Animals{
    private int mysteps;
    

    public wallies(String name, String word, int steps) {
        super(name, word);
        mysteps = steps;
    }

    public int getSteps() {return mysteps;}
    
}
