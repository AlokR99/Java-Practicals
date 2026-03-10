class Management{
    String adminName;
    int year;
    int capacity=600;
    
    static int studentCount=0;
    static int maleCount=0;
    static int femaleCount=0;

    // Each department with 100 capacity
    static int itStudents=0;
    static int csStudents=0;
    static int textileStudents=0;
    static int entcStudents=0;
    static int electricalStudents=0;
    static int mechanicalStudents=0;
    Student[] studentList=new Student[capacity];

    Management(String name,int yr){
        adminName=name;
        year=yr;
    }

    String generateRegistrationNo(String department){
        int year=this.year;
        if(department.equals("Information Technology") && itStudents<100){
            itStudents++;
            if(itStudents>99) return year+"BIT"+itStudents;
            else {
                if(itStudents<10) return year+"BIT"+"00"+itStudents;
                else return year+"BIT"+"0"+itStudents;
            }
        }
        else if(department.equals("Computer Science") && csStudents<100){
            csStudents++;
            if(csStudents>99) return year+"BCS"+csStudents;
            else {
                if(csStudents<10) return year+"BCS"+"00"+csStudents;
                else return year+"BCS"+"0"+csStudents;
            }
        }
        else if(department.equals("Textile Engineering") && textileStudents<100 ){
            textileStudents++;
            if(textileStudents>99) return year+"BTT"+textileStudents;
            else {
                if(textileStudents<10) return year+"BTT"+"00"+textileStudents;
                else return year+"BTT"+"0"+textileStudents;
            }
        }
        else if(department.equals("Electronics and Telecommunication") && entcStudents<100){
            entcStudents++;
            if(entcStudents>99) return year+"BET"+entcStudents;
            else {
                if(entcStudents<10) return year+"BET"+"00"+entcStudents;
                else return year+"BET"+"0"+entcStudents;
            }
        }
        else if(department.equals("Mechanical Engineering") && mechanicalStudents<100){
            mechanicalStudents++;
            if(mechanicalStudents>99) return year+"BME"+mechanicalStudents;
            else {
                if(mechanicalStudents<10) return year+"BME"+"00"+mechanicalStudents;
                else return year+"BME"+"0"+mechanicalStudents;
            }
        }
        else if(department.equals("Electrical Engineering") && electricalStudents<100){
            electricalStudents++;
            if(electricalStudents>99) return year+"BEE"+electricalStudents;
            else {
                if(electricalStudents<10) return year+"BEE"+"00"+electricalStudents;
                else return year+"BEE"+"0"+electricalStudents;
            }
        }else{
            return "INVALID";
        }
    }

    void admitStudent(String name,String DOB,String adress,long mobNo,char gender,String department){
        String reg = generateRegistrationNo(department);

        if(reg.equals("INVALID")){
            System.out.println("Department Full");
            return;
        }
        Student s=new Student(name,DOB,adress,mobNo,gender,department);
        studentList[studentCount++]=s;
        s.regNo=reg;

        if(s.gender=='M') maleCount++;
        else femaleCount++;
    }

    int removeStudent(String regNumber){
        Student[] mylist=this.studentList;
        int found=0;
        int index=0;
        for(int i=0;i<(mylist.length);i++){
            if(mylist[i]==null) break;
            if(regNumber.equals(mylist[i].regNo)){
                found=1;
                index=i;
                for(int j=i;j<mylist.length-1;j++){
                    mylist[j]=mylist[j+1];
                }
                studentCount--;
                if(mylist[index].gender=='M') maleCount--;
                else femaleCount--;
            }
        }
        return found; 
    }

    Student searchStudent(String regNumber){
        Student[] mylist=this.studentList;
        Student s=null;
        for(int i=0;i<mylist.length;i++){
            if(mylist[i]==null) break;
            if(regNumber.equals(mylist[i].regNo)){
                s=mylist[i];
                break;
            }
        }
        return s;
    }

    void updateName(Student s,String newName){
        s.name=newName;
    }
    void updateDOB(Student s, String newDOB){
        s.DOB=newDOB;
    }
    void updateMobNo(Student s, long newNumber){
        s.mobNo=newNumber;
    }
    void updateAdress(Student s,String newAdress){
        s.adress=newAdress;
    }
    void updateGender(Student s,char newGender){
        s.gender=newGender;
    }
    void updateDepartment(Student s,String newDepartment){
        s.regNo=this.generateRegistrationNo(newDepartment);
    }    
}