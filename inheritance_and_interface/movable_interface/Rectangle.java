package movable_interface;

public class Rectangle extends Shape{
    private double x2, y2;
    Rectangle() {super();}
    Rectangle(double x1, double y1, double x2, double y2) {
        super(x1,y1);
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getX2() { return x2; }
    public double getY2() { return y2; }
    public void setX2(double value) { this.x2 = value; }
    public void setY2(double value) { this.y2 = value; }
    public void draw() {
        System.out.println("Drawing a rectangle...");
        System.out.println(this.toString());
    }
    public void move(double dx, double dy) {
        setX(getX()+dx);
        setY(getY()+dy);
        this.x2 += dx;
        this.y2 += dy;
    }
    
    public String toString() {
        return "x1: " + getX() + ", y1: " + getY() + ", x2: " + x2 + ", y2: " + y2;
    }
}
