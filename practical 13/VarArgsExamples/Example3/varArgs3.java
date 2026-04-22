class varArgsSample3{
        
        static void fun(int... args){
                System.out.println("Inside fun(int... args)");
        }
        static void fun(String... args){
                System.out.println("Inside fun(String... args)");
        }
        public static void main(String[] args){

                System.out.print("fun(1,2,3,4,889): ");
                varArgsSample3.fun(1,2,3,4,889);

                System.out.print("fun(\"sggs\",\"nanded\"): ");
                varArgsSample3.fun("sggs","nanded");

                System.out.print("fun(): ");
                varArgsSample3.fun();
        }
}