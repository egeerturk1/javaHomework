package homework1;
public class Line2D {
    private double m;
    private double n;
    public Line2D(double m, double n) {
        this.m = m;
        this.n = n;
    }
    public Line2D(Line2D other){
        this.m = other.m;
        this.n = other.n;
    }
    public double getM() {
        return m;
    }
    public double getN() {
        return n;
    }
    @Override
    public String toString() {
        return "y = " +(int)m+"x+"+(int)n;
    }
    public boolean isParallel(Line2D other){
        if(this.m==other.m&&this.n!=other.n){
            return true;
        }
        else{
            return false;
        }
    }
    public Point2D intersection(Line2D other) {
        double x = (other.n - this.n) / (this.m - other.m);
        double y = (this.m * x) + n;
        if (this.m != other.m) {
            return new Point2D(x,y);
        } else{
            return null;
        }
    }
}
