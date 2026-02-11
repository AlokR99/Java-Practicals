public class HollowDiamond{
    static void method1(int size){
        if(size%2==0){
            System.out.print("Invalid size! Enter the odd size");
            return ;
        }
        int mid=(size+1)/2;
        int star1=mid;
        int star2=mid;
        for(int r=1;r<=size;r++){
            for(int c=1;c<=size;c++){
                if(c==star1 || c==star2) System.out.print("x");
                else System.out.print(" ");
            }
            System.out.println();
            if(r+1<=mid){
                star1-=1;
                star2+=1;
            }else{
                star1+=1;
                star2-=1;
            }
        }
    }

    static void method2(int size){
        if(size%2==0){
            System.out.print("Invalid size! Enter the odd size");
            return ;
        }
        int mid=(size+1)/2;
        int position=mid;
        for(int r=1;r<=size;r++){
            for(int c=1;c<=size;c++){
                if(c==position || c==(size+1)-position) System.out.print("x");
                else System.out.print(" ");
            }
            System.out.println();
            if(r+1<=mid) position-=1;
            else position+=1;
        }
    }

    static void method3(int size){
        if(size%2==0){
            System.out.print("Invalid size! Enter the odd size");
            return ;
        }
        int mid=(size+1)/2;
        System.out.println(" ".repeat(mid-1)+"x");
        int spaces=mid-1;
        for(int r=2;r<size;r++){
            if(r<=mid) spaces-=1;
            else spaces+=1;
            System.out.print(" ".repeat(spaces)+"x");
            System.out.println(" ".repeat((size-2*(spaces+1)))+"x");
        }
        System.out.print(" ".repeat(mid-1)+"x");
    }

    public static void main(String[] str){
        System.out.println("Method 1:");
        method1(Integer.parseInt(str[0]));
        System.out.println("Method 2:");
        method2(Integer.parseInt(str[1]));
        System.out.println("Method 3:");
        method3(Integer.parseInt(str[2]));
    }
}