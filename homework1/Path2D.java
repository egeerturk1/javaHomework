package homework1;
import java.util.ArrayList;
public class Path2D{
    ArrayList<Point2D> point;
    public Path2D(ArrayList<Point2D> point){
        this.point = point;
    }
    public Path2D(Path2D other){
        this.point=other.point;
    }
    public Point2D getPoint(int index){
        return point.get(index);
    }
    @Override
    public String toString() {
        String st = " ";
        for (int i = 0; i < point.size()-1 ; i++){
            st+=point.get(i) + "===";
        }
        st += point.get(point.size()-1) + " ";
        return st;
    }
    public int size(){
        int counter = 0;
        for (int i = 0; i < point.size() ; i++){
            counter++;
        }
        return counter;
    }
    public double length(){
        double len = Math.pow(point.get(point.size()-1).getX()-point.get(0).getX(),2)+Math.pow(point.get(point.size()-1).getY()-point.get(0).getY(),2);
        double length = Math.sqrt(len);
        return length;
    }
    public void addPoint(Point2D other){
        point.add(other);
    }
    public ArrayList<Point2D> combine(Path2D other){
        for (int i = 0; i < other.size() ; i++) {
            point.add(other.getPoint(i));
        }
        return point;
    }
}