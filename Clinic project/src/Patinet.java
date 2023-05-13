public class Patient extends Person {
    private int patientID;
    private String serviceType;

    // Constructor
    public Patient(String name, int age, String gender, String phoneNum, String address, int patientID, String serviceType) {
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.address = address;
        this.patientID = patientID;
        this.serviceType = serviceType;
    }

    // Getter methods
    public int getPatientID() {
         return this.patientID;
    }

    public String getServiceType(){
         return this.serviceType;
    }

    // Setter methods
    public void setPatientID(int patientID) {
         this.patientID = patientID;
   }
   //Set Service type
   public void setServiceType(String serviceType){
         this.serviceType = ServiceType; 
   }

}