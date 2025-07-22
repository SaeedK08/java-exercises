package todo;
import todo.Todo.Priority;

public class TodoMain
{
    public static void main(String[] args)
    {
        Todo item1 = new Todo("Learn OOP", "Follow the lectures, read the textbook", Priority.HIGH);
        System.out.println("last updated: " + item1.getLastUpdated());
        System.out.println(item1.toString());

        // update the item
        item1.addToDescription(", do the exercises");
        item1.checkTask();
        System.out.println("last updated: " + item1.getLastUpdated());
        System.out.println(item1.toString());

        // create an object with default prio, medium
        Todo item2 = new Todo("Pause", "Take a cup of hot coffee");
        System.out.println("last updated: " + item2.getLastUpdated());
        System.out.println(item2.toString());
    }
}
