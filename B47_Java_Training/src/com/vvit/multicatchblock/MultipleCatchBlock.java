package com.vvit.multicatchblock;

public class MultipleCatchBlock {
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[5]=30/0;    
               
        try {
        	float value = 2/0;
        try {
        		 int b[]=new int[3];    
                 a[5]=50/0;  
        	}catch (ArrayIndexOutOfBoundsException b) {
        		System.out.println("ArrayIndexOutOfBounds Exception occurs");
			}
        	
        }catch (ArithmeticException c) {
			System.out.println("Arithmetic Exception occurs");
		}
        }
            catch(ArithmeticException d)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
              {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception f)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  

	}
