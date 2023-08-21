package labwork1;

import java.util.ArrayList;

public class ShapeUtility{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static Shape findLargestArea(ArrayList<Shape> arr){
        double maxArea=0;
        Shape shapeMax=arr.get(0);
        int count=0;
        while (count<arr.size()) {
            if (arr.get(count).getArea()>=maxArea){
                maxArea=arr.get(count).getArea();
                shapeMax=arr.get(count);
            }
            count++;
        }
        System.out.println(ANSI_YELLOW+"THE LARGEST SHAPE AND ITS AREA:"+ANSI_RESET);
        System.out.print(ANSI_GREEN+"Largest Shape:"+ANSI_RESET);
        return shapeMax;
    }
}
