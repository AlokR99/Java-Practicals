class StringExecutionTime{
	static double byString(){
        	double st=System.nanoTime();
        	String utsav="";
        	for(int i=1;i<=2026;i++){
            		utsav+="UTSAV_"+i+"_";
        	}
        	double en=System.nanoTime();
        	return en-st;
    	}

 	static double byStringBuffer(){
        	double st=System.nanoTime();
        	StringBuffer utsav=new StringBuffer("");
        	for(int i=1;i<=2026;i++){
            		utsav.append("UTSAV_");
            		utsav.append(i);
            		utsav.append("_");
        	}
        	double en=System.nanoTime();
        	return en-st;
   	}

    	static double byStringBuilder(){
        	double st=System.nanoTime();
        	StringBuilder utsav=new StringBuilder("");
        	for(int i=1;i<=2026;i++){
            		utsav.append("UTSAV_");
           		utsav.append(i);
            		utsav.append("_");
        	}
        	double en=System.nanoTime();
        	return en-st;
    	}

    	public static void main(String[] args){
        	System.out.println("\nBy String class: "+byString()+"ns");
        	System.out.println("By StringBuffer class: "+byStringBuffer()+"ns");
        	System.out.println("By StringBuilder class: "+byStringBuilder()+"ns"+"\n");
    	}
}