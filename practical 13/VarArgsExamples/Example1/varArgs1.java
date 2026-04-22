class varArgsSample1{
        
        static void fun(int... args){
                System.out.println("Inside fun(int... args)");
        }
        static void fun(char... args){
                System.out.println("Inside fun(char... args)");
        }
        public static void main(String[] args){
                System.out.print("fun(): ");
                varArgsSample1.fun();

                System.out.print("fun(1,2,3,4): ");
                varArgsSample1.fun(1,2,3,4);

                System.out.print("fun(132323,23,6777,10): ");
                varArgsSample1.fun(132323,23,6777,10);
                
                System.out.print("fun('a','b','c'): ");
                varArgsSample1.fun('a','b','c');
        }
}