import java.lang.Math;
public class Triangle implements Polygon{
    protected double a;
    protected double b;
    protected double c;

    public Triangle(){
        a = 3;
        b = 4;
        c = 5;
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void setA(double a) {this.a = a;}
    void setB(double b) {this.b = b;}
    void setC(double c) {this.c = c;}

    double getA() {return a;}
    double getB() {return b;}
    double getC() {return c;}

    @Override
    public double area() {
        return  (a*b)/2;
    }
    @Override
    public double perimeter() {
        return (a+b+c);
    }
    public String toString() {
        return ("Triangle edge lengths: " + a + ", " + b + ", " + c);
    }
}