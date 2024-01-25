package Q3.prog702p;

public class hiccas extends Animals{
    private double furcost;

    public hiccas(String name, String word, double fur) {
        super(name, word);
        furcost = fur;
    }

    

    public double getfur() {return furcost;}
}
