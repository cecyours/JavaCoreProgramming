
public class P17_DivideByZero {  
  
    public static void main(String[] args) {  
          
           try{    
           		
           	     int a[]=new int[5];    
              	  a[5]=30/0;    
              
                }    
               
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               
                            
               System.out.println("rest of the code");    
    }  
}  