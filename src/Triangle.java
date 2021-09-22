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
/*
Create a class called Triangle that uses the Polygon interface;
    Assume this is a right triangle

    double  a, b, c;

Must have a default constructor that sets:
    a = 3
    b = 4
    c = 5

Must have a Constructor that takes in 3 variables:
    a --> 1st argument
    b --> 2nd argument
    c --> 3rd argument

Must have setters and getters for all the variables
    double getA()
    void setA()
    ...
    ...

Must have a toString (test Provided)
    "String toString()" Should return the following:
        "Triangle edge lengths: " + a + ", " + b + ", " + c
 */

