class Pattern{
    static void printPattern(int size){
        if(size%2==0) {
            System.out.println("The entered value "+size+" is not odd.Please enter an odd size.");
            return;
        }
        for(int r=1;r<=size;r++){
            for(int c=1;c<=size;c++){
                if(r==c || r==size-c+1) System.out.print("x");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] str){
        printPattern(6);
	System.out.print("\n\n");
	printPattern(9);
    }
}