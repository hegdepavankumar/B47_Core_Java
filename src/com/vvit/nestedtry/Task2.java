package com.vvit.nestedtry;

public class Task2 {
	  public static void main(String[] args) {  
          
          try{  
        	   //int num = 2/0;
               int a[]=new int[5]; 
               System.out.println(a[10]); 
               /*
           try {
        	   int num = 2/0;
        	   System.out.println(num);
           
           }catch (Exception e) {
			// TODO: handle exception
		}
		*/
              }    
              catch(ArithmeticException e)  
                 {  
                  System.out.println("Arithmetic Exception occurs");  
                 }    
              catch(ArrayIndexOutOfBoundsException e)  
                 {  
                  System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                 }    
              catch(Exception e)  
                 {  
                  System.out.println("Parent Exception occurs");  
                 }             
              System.out.println("All the code");    
   }  

}
