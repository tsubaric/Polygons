/*
Create a class called Rectangle that implements the Polygon interface
Must have a default constructor that sets:
    double: width = 1
    double: height = 1
*/public class Rectangle implements Polygon {

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
/*Must have another Constructor that takes in:
    double: width --> 1st argument
    double: height --> 2nd argument

Must have setters and getters for width and height.
double getWidth()
double getHeight()
void setHeight()
void setWidth()


Must have a toString (test Provided)
    "String toString()" should return the following:
        "Rectangle width & height: " + width + ", " + height
 */

