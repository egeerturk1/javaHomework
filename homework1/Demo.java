package homework1;

import java.util.ArrayList;
public class Demo {
    public static void main(String[] args){
        Point2D p1 = new Point2D(1,5);
        Point2D p2 = new Point2D(2,5);
        Point2D p3 = new Point2D(p1);//Copy Constructor
        Point2D p4 = new Point2D(3,5);
        Point2D p5 = new Point2D(4,5);
        Point2D p6 = new Point2D(6,5);
        Point2D p7 = new Point2D(7,5);
        Point2D p8 = new Point2D(8,5);
        Point2D p9 = new Point2D(9,5);
        ArrayList<Point2D> paths = new ArrayList<>();
        paths.add(p1);
        paths.add(p2);
        paths.add(p3);
        paths.add(p4);
        paths.add(p5);
        paths.add(p6);
        paths.add(p7);
        paths.add(p8);
        paths.add(p9);
        ArrayList<Point2D> pather =new ArrayList<>();
        pather.add(new Point2D(10,5));
        pather.add(new Point2D(11,5));
        pather.add(new Point2D(12,5));
        System.out.println("P1:");
        System.out.println(p1);
        System.out.println("-----------------------");
        System.out.println("P2:");
        System.out.println(p2);
        System.out.println("-----------------------");
        System.out.println("COPY OF P1:");
        System.out.println(p3);
        System.out.println("-----------------------");
        double distance = p1.distanceTo(p2);
        System.out.println("Distance from p1 to p2:");
        System.out.println(distance);
        System.out.println("-----------------------");
        Line2D line1 = new Line2D(6,3);
        System.out.println("LİNE1:");
        System.out.println(line1);
        System.out.println("-----------------------");
        double distanceToLine = p1.distanceTo(line1);
        System.out.println("Distance from p1 to line1:");
        System.out.println(distanceToLine);
        System.out.println("-----------------------");
        Line2D line = new Line2D(3,9);
        boolean parallel = line1.isParallel(line);
        System.out.println("LİNE:");
        System.out.println(line);
        System.out.println("-----------------------");
        System.out.print("Is line1 parallel to line? : ");
        System.out.println(parallel);
        Point2D intersection = line1.intersection(line);
        System.out.println("-----------------------");
        System.out.print("Does line1 and line intersect? : ");
        System.out.println(intersection);
        Path2D path1= new Path2D(paths);
        Path2D path3= new Path2D(pather);
        System.out.println("-----------------------");
        System.out.println("Path1:");
        System.out.println(path1);
        System.out.println("Size of Path1: " + path1.size());
        System.out.println("Length of Path1: "+ path1.length());
        System.out.println("-----------------------");
        System.out.println("Adding p1 to path1 :" );
        path1.addPoint(p1);
        System.out.println(path1);
        System.out.println("-----------------------");
        System.out.println("Adding pather to path1:");
        path1.combine(path3);
        System.out.println(path1);
    }
}