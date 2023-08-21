package labwork1;

public abstract class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public void printDetails(){
        System.out.println("Color: " +"<"+color+">"+","+"Area: "+"<"+getArea()+">");
    }
}
