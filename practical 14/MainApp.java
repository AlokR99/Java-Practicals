import java.util.Scanner;

public class MainApp{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                Calculator c=new Calculator();

                System.out.println(c.start());
                System.out.println(BasicOperations.info());

                while(true){
                        System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");

                        int ch;

                        try{
                                ch=sc.nextInt();
                        }catch(java.util.InputMismatchException e){
                                System.out.println("Invalid choice! Enter number only");
                                sc.nextLine();
                                continue;
                        }

                        if(ch==5)break;

                        try{
                                if(ch<1||ch>4){
                                        throw new InvalidInputException("Wrong choice");
                                }

                                System.out.println("Using:"+c.show(ch));

                                System.out.print("Enter numbers:");

                                double a=sc.nextDouble();
                                double b=sc.nextDouble();

                                double res=0;

                                switch(ch){
                                        case 1:res=c.add(a,b);break;
                                        case 2:res=c.subtract(a,b);break;
                                        case 3:res=c.multiply(a,b);break;
                                        case 4:res=c.divide(a,b);break;
                                }

                                System.out.println("Result:"+c.display(res));

                        }catch(java.util.InputMismatchException e){
                                System.out.println("Invalid input! Enter numbers only");
                                sc.nextLine();
                        }catch(InvalidInputException e){
                                System.out.println("Custom Exception:"+e.getMessage());
                        }catch(ArithmeticException e){
                                System.out.println("Math Error:"+e.getMessage());
                        }catch(Exception e){
                                System.out.println("Error:"+e.getMessage());
                        }
                }

                sc.close();
                System.out.println("End");
        }
}