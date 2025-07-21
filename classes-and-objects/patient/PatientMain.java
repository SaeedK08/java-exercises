package patient;

public class PatientMain {
    public static void main(String[] args)
    {
        Patient patientNr1 = new Patient("Nicklas Brandefelt", "112233-4398");
        System.out.println(patientNr1.getName());
        System.out.println(patientNr1.getPersonalNumber());
        System.out.println(patientNr1.getRecord());
        patientNr1.updateRecord("Abnormal presence of protein in urin");
        patientNr1.updateRecord("Asthma during to seasonal allergies, mainly grass");
        System.out.println(patientNr1.getRecord());
        System.out.println(patientNr1.toString());
    }
}
