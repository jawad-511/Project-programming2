public class Patient extends Person {
    private int patientID;

    // Constructor
    public Patient(String name, int age, String gender, String phoneNum, String address, int patientID) {
        super(name, age, gender, phoneNum, address);
        this.patientID = patientID;
    }

    // Getter methods
    public int getPatientID() {
        return patientID;
    }

    // Setter methods
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
}