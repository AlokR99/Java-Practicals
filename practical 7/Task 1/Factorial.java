public class Factorial{

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
        System.out.println(Iteration(5));
        System.out.println(Iteration(0));
        System.out.println(Iteration(-9));
        System.out.println(Recursion(8));
        System.out.println(Recursion(-10));
        System.out.println(Recursion(1));
        System.out.println(Recursion(0));
    }
}