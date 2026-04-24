interface AdvancedOperations{
        double multiply(double a,double b);
        double divide(double a,double b);

        default String show(){
                return "AdvancedOperations";
        }
}