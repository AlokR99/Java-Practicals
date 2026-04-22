import java.util.Arrays;
class varArgsSample7{
        
        static void fun(int num,int... args){
                System.out.println("Inside fun(int num,int... args)");
                System.out.println("num: "+num);
                System.out.println("Integer args: "+Arrays.toString(args));
        }
        public static void main(String[] args){

                System.out.print("fun(100,1,2,3,4): ");
                varArgsSample7.fun(100,1,2,3,4);
        }
}