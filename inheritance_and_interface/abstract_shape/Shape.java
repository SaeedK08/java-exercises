package abstract_shape;

public abstract class Shape {
    private double x,y;
    Shape() { }
    Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double value) {
        this.x = value;
    }
    public void setY(double value) {
        this.y = value;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y; 
    }
    public abstract void draw();
    public String toString() {
        return "x: " + x + "y: " + y;
    }
}
