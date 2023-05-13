public class Doctor extends Person {
    private String specliazition;
    private int yearsOfProficiency;

    
    public Doctor(String name, int age, String gender, String phoneNum, String address, String specliazition, int yearsOfProficiency) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.address = address;
        this.specliazition = specliazition;
        this.yearsOfProficiency = yearsOfProficiency;
    }

    
    public String getSpecliazition() {
       
        return this.specliazition;
    }

    public int getYearsOfProficiency() {
        return this.yearsOfProficiency; 
    }

    
    public void setSpecliazition(String specliazition) {
        this.specliazition = specliazition;
    }

    public void setYearsOfProficiency(int yearsOfProficiency) {
        this.yearsOfProficiency = yearsOfProficiency;
    }
}
