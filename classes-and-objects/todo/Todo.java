// Skriv en klass vars objekt representerar information om en uppgift som ska utföras, Todo. Ett objekt
// av typen Todo ska ha privata datamedlemmar för
// • titel (String),
// • en beskrivning (String),
// • en tidpunkt då objektet senast uppdaterades (java.time.LocalDateTime),
// • en flagga (boolean) som anger om uppgiften är utförd eller ej.
// Konstruktorn ska ha argument för titel och beskrivning. Tiden för senaste uppdatering ska vara tiden
// då objektet skapas, vilket fås med java.time.LocalDateTime.now()1
// . Flaggan sätts till false (ej utförd).
// I kontraktet för klassen ingår att
// • titeln ska ej kunna ändras efter att objektet skapats,
// • det ska gå att ändra flaggan som markerar om uppgiften är utförd till true,
// • det ska vara möjligt att lägga till text till beskrivningen och datum för senaste uppdatering
// ska då uppdateras.
// Det ska finnas access-metoder för datamedlemmarna samt en egen version av metoden toString.
// Skriv sedan en main-metod som skapar objekt av typen Todo och testar funktionaliteten.
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