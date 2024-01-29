package Q3.abcllab;

public abstract class notcircle implements shape{
    protected double height;

    public abstract double getheight();
    public abstract void setheight(double h);

    public void printclass() {
        System.out.println(this.getClass().getSimpleName());
    }
}
