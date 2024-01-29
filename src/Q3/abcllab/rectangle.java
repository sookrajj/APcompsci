package Q3.abcllab;

public class rectangle extends notcircle{
    private double width;

    public rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setheight(double h) {height = h;}
    public void setWidth(double w) {width = w;}
    public double getheight() {return height;}
    public double getwidth() {return width;}

    public void calculatearea() {
        System.out.println("Area: " + width * height);
    }
    public void calculatecircumference() {
        System.out.println("Perimeter: " + (2*width + 2*height));
    }

    public void calcperim() {
        this.calculatecircumference();
    }
}
