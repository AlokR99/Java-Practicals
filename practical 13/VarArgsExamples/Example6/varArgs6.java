class varArgsSample6{
        
        static void fun(char... ch,int... args){
                System.out.println("Inside fun(char... ch,int... args)");
        }
        public static void main(String[] args){

                System.out.print("fun('a','b','c',1,2,3,4): ");
                varArgsSample6.fun('a','b','c',1,2,3,4);
        }
}