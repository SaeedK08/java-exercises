package todo;
import java.time.LocalDateTime;

public class Todo
{
    public enum Priority {LOW, MEDIUM, HIGH};

    private final String title;
    private String description;
    private LocalDateTime lastUpdated;
    private boolean done;
    private final Priority prio;

    public Todo(String title, String description, Priority prio)
    {
        this.title = title;
        this.description = description;
        this.lastUpdated = LocalDateTime.now();
        this.done = false;
        this.prio = prio;
    }
    public Todo(String title, String description)
    {
        this(title, description, Priority.MEDIUM);
    }
    public String getTitle()
    {
        return title;
    }
    public String getDescription()
    {
        return description;
    }
    public LocalDateTime getLastUpdated() 
    {
        return lastUpdated;
    }
    public boolean getDone()
    {
        return done;
    }
    public Priority getPriority()
    {
        return prio;
    }
    public void addToDescription(String textToAdd)
    {
        description += textToAdd;
        lastUpdated = LocalDateTime.now();
    }
    public void checkTask()
    {
        done = true;
    }

    @Override
    public String toString()
    {
        String info;
        info = "Todo {Title: " + title  + "| Description: " + description + "| Last update: " + lastUpdated  + "| Priority: " + prio + "| Status: ";
        info += done ? "Done}" : "Not done}";
        return info;
    }
}