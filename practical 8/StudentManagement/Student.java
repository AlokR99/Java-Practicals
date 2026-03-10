class Student{
    String name;
    String regNo;
    String DOB;
    String adress;
    long mobNo;
    char gender;
    String department;

    Student(String Name,String dob,String Adress,long MobNo,char Gender,String Department){
        name=Name;
        DOB=dob;
        adress=Adress;
        mobNo=MobNo;
        gender=Gender;
        department=Department;
    }

    void displayName() {
        System.out.println(name);
    }
    void displayRegNo(){
        System.out.println(regNo);
    }
    void displayDOB() {
        System.out.println(DOB);
    }
    void displayAdress() {
        System.out.println(adress);
    }
    void displayMobNo() {
        System.out.println(mobNo);
    }
    void displayGender() {
        System.out.println(gender);
    }
}