import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidOperationChoice extends RuntimeException{
        InvalidOperationChoice(String message){
                super(message);
        }
}

class RecursionLimitException extends Exception{
        RecursionLimitException(String message){
                super(message);
        }
}

class Calculator {
        static void add(double num1,double num2){
                System.out.println("Sum is :"+(num1+num2));
        }
        static void sub(double num1,double num2){
                System.out.println("Sub is :"+(num1-num2));
        }

        static void mul(double num1,double num2) {
                System.out.println("Mul is :"+(num1*num2));
        }

        static void div(double num1,double num2){
                if(num2==0){
                throw new ArithmeticException("Division by zero");
                }
                double ans=(double)num1/num2;
                System.out.println("Div is :"+ans);
        }

        static long fact(int num)throws RecursionLimitException{
                if(num <0){
                System.out.println("Factorial not defined for negative numbers");
                return -1;
                }
                else if(num>20){
                throw new RecursionLimitException("Unexpected outputs for num > 20, Enter <20 integers");
                }
                if(num== 0 ||num==1){
                return 1;
                }
                return num*fact(num-1);
        }
}

class Main {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int choice=1;

                while(choice!=0){

                try{
                        System.out.println("Enter:: 1.Add  2.Sub  3.Mul  4.Div  5.Fact");
                        int operation=sc.nextInt();
                        if(operation==5){
                        System.out.print("Enter num: ");
                        int num=sc.nextInt();
                        System.out.println("Factorial is :"+Calculator.fact(num));
                        }
                        else if(operation>=1 && operation<=4){
                        System.out.print("Enter num1: ");
                        double num1=sc.nextDouble();

                        System.out.print("Enter num2: ");
                        double num2=sc.nextDouble();

                        if(operation==1) Calculator.add(num1,num2);
                        else if(operation==2) Calculator.sub(num1,num2);
                        else if(operation==3) Calculator.mul(num1,num2);
                        else if(operation==4) Calculator.div(num1,num2);
                        }
                        else{
                        throw new InvalidOperationChoice("Invalid choice! Enter 1-5 only.");
                        }
                        System.out.println("-----------------------");
                        System.out.print("Enter 0 to Exit or any number to continue: ");
                        choice=sc.nextInt();
                }
                catch(ArithmeticException e){
                        System.out.println("Denominator can't be ZERO...\n-------");
                }
                catch(InvalidOperationChoice e){
                        System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                        System.out.println("Enter numeric number only for choice selection, numbers and only integer for factorial\n------ ");
                        sc.nextLine();
                }
                catch(RecursionLimitException e){
                        System.out.println(e.getMessage());
                }
                }
        }
}