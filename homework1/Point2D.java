package homework1;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D other){
        this.x= other.x;;
        this.y= other.y;;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }
    public double distanceTo(Point2D other){
        double squaresx = other.x-x;
        double sqauresy = other.y-y;
        double calculation= Math.pow(squaresx,2)+Math.pow(sqauresy,2);
        double distance = Math.sqrt(calculation);
        return distance;
    }
    public double distanceTo(Line2D line){
        double n1 = (line.getM()*x)+(-1*y)+ line.getN();
        double n2 = Math.abs(n1);
        double n3= n2/Math.sqrt(Math.pow(line.getM(),2)+1);
        return n3;
    }
}
