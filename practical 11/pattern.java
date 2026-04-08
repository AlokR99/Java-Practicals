class PrintPattern {

        static void iterationPattern(int size){
        	if(size <= 0){
            		System.out.println("Enter the non-negative integer size");
           		return;
        	}

        	int mid = (size + 1) / 2;
        	int ss = 2 * mid - 2;
        	int stars = 1;
        	int spaceSteps = -2;
        	int starSteps = 4;

        	for(int i = 1; i <= size; i++){
        		System.out.println(" ".repeat(ss) + "*".repeat(stars));
        		if(i == mid){
                		if(size % 2 == 0){
                    			System.out.println(" ".repeat(ss) + "*".repeat(stars));
                    			i++;
               			}
                		spaceSteps = 2;
                		starSteps = -4;
            		}
            		ss += spaceSteps;
            		stars += starSteps;
        	}
    	}

    	static void printRow(int stars, int spaces){
        	System.out.println(" ".repeat(spaces) + "*".repeat(stars));
    	}

    	static void recursionPattern(int size, int mid, int line, int stars, int spaces){
        	if (line > mid) return;
        	printRow(stars, spaces);
        	if (line == mid){
            		if (size % 2 == 0){
                		printRow(stars, spaces);
            		}
            	return;
        	}
        	recursionPattern(size, mid, line + 1, stars + 4, spaces - 2);
        	printRow(stars, spaces);
    	}
}

class Main {
    	public static void main(String[] args){
        	int size = Integer.parseInt(args[0]);
        	int mid = (size + 1) / 2;
        	System.out.println("Using Iteration:");
        	PrintPattern.iterationPattern(size);
        	System.out.println("\n\nUsing recursion:");
        	PrintPattern.recursionPattern(size, mid, 1, 1, 2 * mid - 2);
    	}
}