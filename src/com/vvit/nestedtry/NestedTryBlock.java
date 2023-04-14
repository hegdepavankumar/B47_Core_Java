package com.vvit.nestedtry;

public class NestedTryBlock {
	public static void main(String[] args) {
		
	
	 //outer try block   
	  try{ 
		  
        int num = 2/0;
        System.out.println(num);
	          
	    try{    
	     System.out.println("Divide by 0");    
	     int b =39/0;    
	   }  
	    
	    //catch block of inner try block 1  
	    catch(ArithmeticException e)  
	    {  
	      System.out.println(e);  
	    }    
	       
	    
	    //inner try block 2  
	    try{    
	    int a[]=new int[5];    
	  
	    //assigning the value out of array bounds  
	     a[5]=4;    
	     }  
	  
	    //catch block of inner try block 2  
	    catch(ArrayIndexOutOfBoundsException e)  
	    {  
	       System.out.println(e);  
	    }    
	  
	      
	    System.out.println("Hi pavankumar");    
	  }  
	  //catch block of outer try block  
	  catch(Exception e)  
	  {  
	    System.out.println("handled the exception (outer catch)");  
	  }    
	    
	  System.out.println(" Rnunning normal flow..");    

}
}
