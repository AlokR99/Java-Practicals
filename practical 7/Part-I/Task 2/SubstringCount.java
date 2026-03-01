class SubstringCount{
	static int Method1(String str1,String str2){
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			if((str1.substring(i,str2Len+i)).equals(str2)) count++;
		}
		return count;
	}
	static int Method2(String str1,String str2){
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			if(str1.startsWith(str2,i)) count++;
		}
		return count;
	}
	static int Method3(String str1,String str2){
		int count=0;
		int str2Len=str2.length();
		for(int i=0;i<=(str1.length()-str2Len);i++){
			for(int j=0;j<str2Len;j++){
				if(str1.charAt(i+j)!=str2.charAt(j)) break;
				else if(j==str2Len-1) count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println("Method 1:Substring count="+Method1("abcabcaaaddcdsabcad","abca"));
		System.out.println("Method 2:Substring count="+Method2("abcabcaaaddcdsabcad","abca"));
		System.out.println("Method 3:Substring count="+Method3("abcabcaaaddcdsabcad","abca"));
	}	
}