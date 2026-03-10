import java.util.Scanner;

class StudentManagementSystem{

    public static void main(String[] args){
        System.out.println("----------WELCOME TO SGGS STUDENT MANAGEMENT SYSTEM----------");
        Management m=new Management("admin1",2026);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the below options :\n");
        System.out.println("Enter 1 to Admit Student ");
        System.out.println("Enter 2 to remove Student");
        System.out.println("Enter 3 to count Total Students ");
        System.out.println("Enter 4 to count Total Boys ");
        System.out.println("Enter 5 to count Total Girls ");
        System.out.println("Enter 6 to Search Student ");
        System.out.println("Enter 7 to Edit Student Info... ");
        System.out.println("Enter 8 to EXIT... \n\n");
        boolean runLoop=true;
        while(runLoop){
            System.out.print("Enter the operation :");
            int operation=sc.nextInt();

            switch(operation){
                // Student s=new Student(name,DOB,adress,mobNo,gender,department);
                case 1:
                    if(m.studentCount==m.capacity) {
                        System.out.println("Seats are full ...Admission Closed");
                        break;
                    }
                    System.out.println("----------ADDING new STUDENTS:-----------\n");
                    System.out.print("Enter the No. of Students to Admit:");
                    int students=sc.nextInt();
                    sc.nextLine();
                    while(m.studentCount+students > m.capacity){
                        System.out.println("Only "+(m.capacity-m.studentCount)+" seats are there.");
                        System.out.print("Re-Enter the No. of Students to Admit:");
                        students=sc.nextInt();
                    }
                    for(int i=0;i<students;i++){
                        System.out.println("STUDENT: "+(i+1));
                        System.out.print("Enter the Student Name:");
                        String name=sc.nextLine();
                        System.out.print("Enter the Student Date of Birth:");
                        String DOB=sc.nextLine();
                        System.out.print("Enter the Student Adress:");
                        String adress=sc.nextLine();
                        System.out.print("Enter the Student Mobile Number:");
                        long mobNo=sc.nextLong();
                        sc.nextLine();
                        System.out.print("Enter the Student Gender(M/F):");
                        char gender=sc.next().charAt(0);
                        sc.nextLine();
                        System.out.println("Enter the Department Choice:(1-6)");
                        System.out.print("1.IT | 2.CSE | 3.Textile | 4.EnTC | 5.Mech | 6.Elec\nCoice: ");
                        int department_choice=sc.nextInt();
                        sc.nextLine();
                        String department="";

                        switch(department_choice){
                            case 1:
                                department="Information Technology";
                                break;
                            case 2:
                                department="Computer Science";
                                break;
                            case 3:
                                department="Textile Engineering";
                                break;
                            case 4:
                                department="Electronics and Telecommunication";
                                break;
                            case 5:
                                department="Mechanical Engineering";
                                break;
                            case 6:
                                department="Electrical Engineering";
                                break;
                            default:
                                System.out.println("You Entered Wrong choice");
                        }
                        m.admitStudent(name,DOB,adress,mobNo,gender,department);
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                    }
                    Student[] listOfStudents=m.studentList;
                    System.out.println("Students Admitted");
                    for(int i=0;i<m.studentCount;i++){
                        System.out.println("Student_"+(i+1)+":"+listOfStudents[i].regNo);
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    System.out.println("\n----------REMOVING old STUDENT:-----------\n");
                    System.out.print("Enter the Registration Number of student to remove:");
                    String reg=sc.next();
                    sc.nextLine();
                    int found=m.removeStudent(reg);
                    if(found==0) System.out.println("Student is not present already or INVALID Registration Number");
                    else System.out.println("------------Student Removed Successfully---------");
                    break;
                case 3:
                    System.out.println("\n----------COUNTING TOTAL STUDENTS:-----------\n");
                    System.out.println("The Total No. of Students are: "+m.studentCount);
                    System.out.println("-----------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("\n----------COUNTING TOTAL BOYS:-----------\n");
                    System.out.println("The Total No. of Boys are: "+m.maleCount);
                    System.out.println("-----------------------------------------------------------\n");
                    break;
                case 5:
                    System.out.println("\n----------COUNTING TOTAL GIRLS:-----------\n");
                    System.out.println("The Total No. of girls are: "+m.femaleCount);
                    System.out.println("-----------------------------------------------------------\n");
                    break;
                case 6:
                    System.out.print("Enter the Registration Number of student to search:");
                    String registrationNo=sc.next();
                    sc.nextLine();
                    Student s=m.searchStudent(registrationNo);
                    if(s==null){
                        System.out.println("------Student Not Found------");
                    }
                    else{
                        System.out.println("Student Found !");
                        System.out.println("Enter options to display student details:");
                        System.out.println("1. To display ");
                        System.out.println("2. To not display ");
                        int yourChoice=sc.nextInt();
                        sc.nextLine();
                        switch(yourChoice){
                            case 1:
                                System.out.println("Name: "+s.name);
                                System.out.println("DOB: "+s.DOB);
                                System.out.println("Adress: "+s.adress);
                                System.out.println("Registration Number: "+s.regNo);
                                System.out.println("Department: "+ s.department);
                                System.out.println("Gender :"+ s.gender);
                                System.out.println("-------------------------------------------------\n");
                                break;
                            case 2:
                                System.out.println("----------Thank You !------------\n");
                                break;
                            default:
                                System.out.println("---------Invalid Choice...---------\n");
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n\n-------UPDATING STUDENT Info ------------\n");
                    System.out.print("Enter the Student Registration Number:");
                    String registrationNumber=sc.next();
                    sc.nextLine();
                    Student stud=m.searchStudent(registrationNumber);
                    if(stud==null){
                        System.out.println("------Student Not Found------");
                    }
                    else{
                        System.out.println("Student Found !");
                    }
                    while(stud!=null){
                        System.out.println("Choices to update:");
                        System.out.print("1.Name | 2.DOB | 3.Mobile No. | 4.Adress | 5.Gender | 6.Department | 7.EXIT\nCoice: ");
                        int updateChoice=sc.nextInt();
                        sc.nextLine();
                        switch(updateChoice){
                            case 1:
                                System.out.print("Enter the New Name:");
                                String newName=sc.nextLine();
                                m.updateName(stud,newName);
                                break;
                            case 2:
                                System.out.print("Enter the New DOB:");
                                String newDOB=sc.nextLine();
                                m.updateDOB(stud,newDOB);
                                break;
                            case 3:
                                System.out.print("Enter the New Mobile Number:");
                                long newNumber=sc.nextLong();
                                sc.nextLine();
                                m.updateMobNo(stud,newNumber);
                                break;
                            case 4:
                                System.out.print("Enter the New Adress:");
                                String newAdress=sc.nextLine();
                                sc.nextLine();
                                m.updateAdress(stud,newAdress);
                                break;
                            case 5:
                                System.out.print("Enter the Gender:");
                                char newGender=sc.next().charAt(0);
                                sc.nextLine();
                                m.updateGender(stud,newGender);
                                break;
                            case 6:
                                System.out.print("Entering New Department:");
                                System.out.println("Enter the Department Choice:(1-6)");
                                System.out.print("1.IT | 2.CSE | 3.Textile | 4.EnTC | 5.Mech | 6.Elec\nCoice: ");
                                int dep_choice=sc.nextInt();
                                sc.nextLine();
                                String newDepartment="";

                                switch(dep_choice){
                                    case 1:
                                        newDepartment="Information Technology";
                                        break;
                                    case 2:
                                        newDepartment="Computer Science";
                                        break;
                                    case 3:
                                        newDepartment="Textile Engineering";
                                        break;
                                    case 4:
                                        newDepartment="Electronics and Telecommunication";
                                        break;
                                    case 5:
                                        newDepartment="Mechanical Engineering";
                                        break;
                                    case 6:
                                        newDepartment="Electrical Engineering";
                                        break;
                                    default:
                                        System.out.println("You Entered Wrong choice");
                                }        
                                m.updateDepartment(stud,newDepartment);
                                System.out.println("New Registration Number is: "+stud.regNo);
                                System.out.println("--------------------------------------------");
                                break;
                            case 7:
                                System.out.println("-------------------------------------------\n");
                                stud=null;
                                break;
                            default:
                                System.out.println("You Entered Wrong Option\n");
                        }
                    }
                    break;
                case 8:
                    System.out.println("\n\nExiting Program...");
                    System.out.println("-----------------------------------------------------------\n");
                    runLoop=false;
                    break;
                default:
                    System.out.println("You Entered Wrong Option\n");
            }
        }
    }
}