package labwork1;

public class Circle extends Shape{
    static double PI=3.14;
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area= PI*Math.pow(radius,2);
        return area;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Radius of the circle: "+radius);
    }
}
