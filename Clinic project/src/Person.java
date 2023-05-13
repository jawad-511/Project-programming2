public class Person {
    private String name;
    private int age;
    private String gender;
    private String phoneNum;
    private String address;

    // Constructor
    public Person(String name, int age, String gender, String phoneNum, String address) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.phoneNum = phoneNum;
       this.address = address;
    }

    public String getName() {
       
        return this.name;
    }

    public int getAge() {
        return this.age;    
    }


    public String getGender() {
         return this.gender;
    }

    public String getPhoneNum() {
         return this.phoneNum;
    }

    public String getAddress() {
         return this.address;
    }

    
    public void setName(String name) {
       this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;

    public void setAddress(String address) {
        this.address = address;
        
    }
}
}