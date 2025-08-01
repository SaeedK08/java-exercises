package abstract_shape;


public class Main {
    public static void main(String[] args) {
       Shape[] shapes = {new Circle(10,20,15), new Rectangle(10, 20, 40, 80)}; 
       for (int i = 0; i < shapes.length; i++)
       {
            shapes[i].draw();    
       }
       System.out.println(((Circle)shapes[0]).getCircleRadius());       // Down cast of reference
    }
}
