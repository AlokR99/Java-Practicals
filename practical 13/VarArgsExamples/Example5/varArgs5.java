class varArgsSample5{
        
        static void fun(int... args,char... ch){
                System.out.println("Inside fun(int... args,char... ch)");
        }
        public static void main(String[] args){

                System.out.print("fun(1,2,3,4,'a','b','c'): ");
                varArgsSample5.fun(1,2,3,4,'a','b','c');
        }
}