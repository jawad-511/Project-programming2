public class Doctor extends Person {
    private String Job;
    private int yearsOfProficiency;

    // Constructor
    public Doctor(String name, int age, String gender, String phoneNum, String address, String Job, int yearsOfProficiency) {
        super(name, age, gender, phoneNum, address);
        this.Job = Job;
        this.yearsOfProficiency = yearsOfProficiency;
    }

    // Getter methods
    public String getJob() {
        return Job;
    }

    public int getYearsOfProficiency() {
        return yearsOfProficiency;
    }

    // Setter methods
    public void setJob(String Job) {
        this.Job = Job;
    }

    public void setYearsOfProficiency(int yearsOfProficiency) {
        this.yearsOfProficiency = yearsOfProficiency;
    }
}
