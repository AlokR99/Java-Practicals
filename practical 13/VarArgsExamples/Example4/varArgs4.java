class varArgsSample4{
        
        static void fun(int... args,int num1){
                System.out.println("Inside fun(int... args,int num1)");
        }
        public static void main(String[] args){

                System.out.print("fun(1,2,3,4,  889): ");
                varArgsSample4.fun(1,2,3,4,  889);
        }
}