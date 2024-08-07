package com.firdos.Exceptions;

 class WithoutException {
	 
	 public static void main(String args[]) {
		 
		 int d=0;
      try {
		 int a =42/d; // exception occured
		 String s="F";
		 System.out.println("Will nit be printed"+s);
		 
        }
    catch(ArithmeticException e){
    	
    	System.out.println("exception caught"+e.getMessage());
    	System.exit(0);
}
      catch(NullPointerException e){
      	
      	System.out.println("exception caught"+e.getMessage());
  }
		catch(Exception e){
      System.out.println("Will nit be printed");
		
	 }
     finally {
    	 System.out.println("I will execute any ways");
     }
	 }
}

