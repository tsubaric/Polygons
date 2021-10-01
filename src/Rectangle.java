public class Rectangle implements Polygon {
    protected double a;
    protected double b;

    public Rectangle(){
        a = 1;
        b = 1;
    }
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    void setWidth(double a) {
        this.a = a;
    }
    void setHeight(double b) {
        this.b = b;
    }
    double getWidth() {
        return a;
    }
    double getHeight() {
        return b;
    }
    @Override
    public double area() {
        return (a*b);
    }
    @Override
    public double perimeter() {
        return (2*a)+(2*b);
    }
    public String toString() {
        return ("Rectangle width & height: " + a + ", " + b);

    }
}

