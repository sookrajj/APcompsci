package Q3.abcllab;

public class circle implements shape{
    private double radius;

    public circle(double rad) {
        radius = rad;
    }

    public void setRadius(double rad) {radius = rad;}
    public double getRadius() {return radius;}

    public void calculatearea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area);
    }

    public void calculatecircumference() {
        double circum = Math.PI * radius * 2;
        System.out.println("Circumference: " + circum);
    }

    public void printclass() {
        System.out.println(this.getClass().getSimpleName());
    }
}
