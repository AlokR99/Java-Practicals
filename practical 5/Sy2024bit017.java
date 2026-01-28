public class Sy2024bit017{
    static void pp1(int size){
        for(int i=1;i<size;i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2*(size-i)-1));
            System.out.print("*".repeat(i));
            System.out.print("\n");
        }
        System.out.print("*".repeat(2*size-1));
        System.out.print("\n\n");
        return;
    }

    static void pp2(int size){
        for(int i=1;i<=size;i++){
            System.out.print(" ".repeat(i-1));
            System.out.print("*".repeat(size));
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    static void pp3(int size){
        int f;

        for(int i=1;i<=(2*size-1);i++){

            if(i<size) f=(size-i);
            else  f=(i%size);
            System.out.print(" ".repeat(f));
            System.out.print("* ".repeat(size-f));
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    static void pp4(int size){
        int num=1;
        int line=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++) System.out.print(num+++" ");
            System.out.println();
        }
        System.out.print("\n\n");
    }

    static void pp5(int size){
        int f;
        int num=1;

        for(int i=1;i<=(2*size-1);i++){

            if(i<size) f=(size-i);
            else  f=(i%size);

            System.out.print(" ".repeat(f));
            for(int j=1;j<=(size-f);j++){
                System.out.print(num+++" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String str[]){
        pp1(10);
        pp2(10);
        pp3(10);
        pp4(5);
        pp5(3);
    }
}