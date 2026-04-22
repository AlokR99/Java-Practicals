class varArgsSample2{
        
        static void fun(int... args){
                System.out.println("Inside fun(int... args)");
        }
        static void fun(float... args){
                System.out.println("Inside fun(float... args)");
        }
        public static void main(String[] args){
                System.out.print("fun(): ");
                varArgsSample2.fun();

                System.out.print("fun(1,2,3,4,889): ");
                varArgsSample2.fun(1,2,3,4,889);

                System.out.print("fun(13.5f , 77.0f): ");
                varArgsSample2.fun(13.5f , 77.0f);
        }
}