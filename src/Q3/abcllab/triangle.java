package Q3.abcllab;

public class triangle extends notcircle{
    private double base;

    public triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void setheight(double h) {height = h;}
    public void setWidth(double b) {base = b;}
    public double getheight() {return height;}
    public double getwidth() {return base;}

    public void calculatearea() {
        System.out.println("Area: " + 0.5* base * height);
    }
    public void calculatecircumference() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Math.hypot() possible
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public void calcperim() {
        this.calculatecircumference();
    }
}

