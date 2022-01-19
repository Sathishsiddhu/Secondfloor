package BSection;

public class Test {
	
	public static void main(String[] args) {
       try {
    	   String s = "56a65";
    	   int parseint = Integer.parseInt(s);
    	   System.out.println(parseint);	   
       try {
           System.out.println(9/0);
       }
       catch (ArithmeticException e) {
    	   System.out.println("Alphanumberic");
       }   
    	finally {   
    		System.out.println("START");
       }
       }
       catch (Exception e) {
    	   System.out.println("char");
       }
       finally {
    	   System.out.println("5");
    	  
       }
    	   
}
       
}

