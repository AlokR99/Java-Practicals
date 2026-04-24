class InvalidInputException extends Exception{
        InvalidInputException(String msg){
                super(msg);
        }
}

class Calculator extends CalculatorBase implements BasicOperations,AdvancedOperations{

        public double add(double a,double b){
                return a+b;
        }

        public double subtract(double a,double b){
                return a-b;
        }

        public double multiply(double a,double b){
                return a*b;
        }

        public double divide(double a,double b){
                if(b==0){
                        throw new ArithmeticException("Divide by zero");
                }
                return a/b;
        }

        public String show(){
                return "";
        }

        String show(int ch){
                if(ch==1||ch==2){
                        return BasicOperations.super.show();
                }else{
                        return AdvancedOperations.super.show();
                }
        }

        double display(double result){
                return result;
        }
}


