public class FactorialExecutionTime{

    static int Iteration(int num){
        if(num<0) return -1;
        int ans=1;
        for(int i=1;i<=num;i++) ans*=i;
        return ans;
    }
    static int Recursion(int num){
        if(num==0) return 1;
        else if(num<0) return -1;
        else return num*Recursion(num-1);
    }
    public static void main(String[] args){

	long st=System.nanoTime();
	Iteration(400);
	long et=System.nanoTime();
	System.out.println("Execution Time for Factorial of 400 using Iteration:"+(et-st)+"ns");
	
	st=System.nanoTime();
	Recursion(400);
	et=System.nanoTime();
        System.out.println("Execution Time for Factorial of 400 using Recursion:"+(et-st)+"ns"+"\n");
    }
}