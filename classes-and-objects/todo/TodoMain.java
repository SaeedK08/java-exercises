package todo;

public class TodoMain
{
    public static void main(String[] args)
    {
        Todo item = new Todo("Learn OOP", "Follow the lectures, read the textbook");
        System.out.println("last updated: " + item.getLastUpdated());
        System.out.println(item.toString());

        item.addToDescription(", do the exercises");
        System.out.println("last updated: " + item.getLastUpdated());
        item.checkTask();
        System.out.println(item.toString());
    }
}