package movable_interface;

public class Circle extends Shape {
    private double radius;
    Circle() {super();}
    Circle(double x, double y, double radius) {
        super(x,y);
        this.radius = radius;
    }
    public double getCircleRadius() {
        return radius;
    }
    public void setCircleRadius(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle");
        System.out.println(this.toString());
    }
    public void move(double dx, double dy) {
        setX(getX()+dx);
        setY(getY()+dy); 
    }
    public String toString() {
        return "x: " + getX() + ", y: " + getY() + ", Radius: " + radius;
    }
}


