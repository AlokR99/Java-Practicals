class SubstringCountExecutionTime{
	static long Method1(String str1,String str2){
	    	long st=System.nanoTime();
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			if((str1.substring(i,str2Len+i)).equals(str2)) count++;
		}
	    	long et=System.nanoTime();
		return et-st;
	}
	static long Method2(String str1,String str2){
	    	long st=System.nanoTime();
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			if(str1.startsWith(str2,i)) count++;
		}
		long et=System.nanoTime();
		return et-st;
	}
	static long Method3(String str1,String str2){
	    	long st=System.nanoTime();
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			for(int j=0;j<str2Len;j++){
				if(str1.charAt(i+j)!=str2.charAt(j)) break;
				else if(j==str2Len-1) count++;
			}
		}
		long et=System.nanoTime();
		return et-st;
	}
	public static void main(String[] args){
		System.out.println("Total substring count methods Execution Time:"+"\n");
		System.out.println("Execution Time for Method 1:"+Method1("abcabcaaaddcdsabcad","abca")+"ns");
		System.out.println("Execution Time for Method 2:"+Method2("abcabcaaaddcdsabcad","abca")+"ns");
		System.out.println("Execution Time for Method 3:"+Method3("abcabcaaaddcdsabcad","abca")+"ns"+"\n");
	}	
}