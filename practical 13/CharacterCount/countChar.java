class InvalidArgException extends RuntimeException{
	InvalidArgException(String msg){
		super(msg);
	}
}

class NumberOfArgsException extends RuntimeException{
	NumberOfArgsException(String msg){
		super(msg);
	}
}

class Sample{
	static int charCount1(String s1,String s2){
		int count=0;
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)==s1.charAt(0)) count++;
		}
		return count;
	}

	static int charCount2(String s1,String s2){
		int count=0;
		char[] arr=s2.toCharArray();
		for(char chr:arr){
			if(chr==s1.charAt(0)){
				count++;
			}
		}
		return count;
	}

	static int charCount3(String s1,String s2){
		String a=s2.replace(s1,"");
		return s2.length()-a.length();
	}

	public static void main(String[] args){
		try{
			
			if(args[0].length()>1){
				throw new InvalidArgException("\nEnter only one Character in first Argument, not String !");
			}
			if(args.length >2){
				System.out.println("You Entered more than 2 argumnets, \nconsidering only initial two arguments ...\nskipping rest!\n");
			}
			System.out.println("Character count using method1 is:"+Sample.charCount1(args[0],args[1]));
			System.out.println("Character count using method2 is:"+Sample.charCount2(args[0],args[1]));
			System.out.println("Character count using method3 is:"+Sample.charCount3(args[0],args[1]));
		}
		catch(InvalidArgException e){
			System.out.println(e.getMessage());
		}
		catch(NumberOfArgsException e){
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter more than one command-line arguments...");
		}
		
	}
}

