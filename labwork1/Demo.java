package labwork1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("Blue", 5, 3);
        Shape shape2 = new Rectangle("Red", 5.5, 8);
        Shape shape3 = new Rectangle("Yellow", 1, 2.6);
        Shape shape4 = new Circle("Pink", 3);
        Shape shape5 = new Circle("Black", 15);
        Shape shape6 = new Circle("Orange", 9.9);
        System.out.println("Area of shape1: "+shape1.getArea());
        System.out.println("Area of shape2: "+shape2.getArea());
        System.out.println("Area of shape3: "+shape3.getArea());
        System.out.println("Area of shape4: "+shape4.getArea());
        System.out.println("Area of shape5: "+shape5.getArea());
        System.out.println("Area of shape6: "+shape6.getArea());
        System.out.println("===============");
        shape1.printDetails();
        System.out.println("===============");
        shape2.printDetails();
        System.out.println("===============");
        shape3.printDetails();
        System.out.println("===============");
        shape4.printDetails();
        System.out.println("===============");
        shape5.printDetails();
        System.out.println("===============");
        shape6.printDetails();
        System.out.println("===============");
        ArrayList<Shape> listOfShapes = new ArrayList<>();
        Shape i;
        listOfShapes.add(shape1);
        listOfShapes.add(shape2);
        listOfShapes.add(shape3);
        listOfShapes.add(shape4);
        listOfShapes.add(shape5);
        listOfShapes.add(shape6);
        i=ShapeUtility.findLargestArea(listOfShapes);
        i.printDetails();//I couldn't write 'System.out.println(ShapeUtility.findLargestArea(listOfShapes);' because thee is no toString method and I can't return object and print it.
    }
}
