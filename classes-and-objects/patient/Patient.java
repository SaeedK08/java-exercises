package patient;

import java.lang.invoke.StringConcatFactory;
import java.time.LocalDate;

public class Patient {
    private final String name;
    private final String personalNumber;
    private String record;
    public Patient(String name, String personalNumber)
    {
        this.name = name;
        this.personalNumber = personalNumber;
        this.record = "";
    }
    public String getName()
    {
        return name;
    }
    public String getPersonalNumber()
    {
        return personalNumber;
    }
    public String getRecord()
    {
        return record;
    }
    public void updateRecord(String s)
    {
        
        record += "[" + LocalDate.now().toString() + "]" + " " + s + "\n";
    }

    @Override
    public String toString()
    {
        String info;
        info = "Name: " + name + "| Personal Number: " + personalNumber + "| Patient Record: " + record;
        return info;
    }
}
