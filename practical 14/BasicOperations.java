interface BasicOperations{
        double add(double a,double b);
        double subtract(double a,double b);

        default String show(){
                return "BasicOperations";
        }

        static String info(){
                return "Calculator using interfaces";
        }
}