package movable_interface;


public class Main {
    public static void main(String[] args) {
        // 2 interface-references referencing objects of types
        // implementing the interface

        Movable[] movableShapes = {new Circle(5,10,15), new Rectangle(3,6,4,8)};
        for(int i = 0; i < movableShapes.length; i++) {
            movableShapes[i].move(2, 2);
            System.out.println(movableShapes[i].toString());
        }
    }
}
