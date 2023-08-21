package labwork1;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea() {
        double area =length*width;
        return area;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Length of the rectangle: "+length);
        System.out.println("Width of the rectangle: "+width);
    }
}
