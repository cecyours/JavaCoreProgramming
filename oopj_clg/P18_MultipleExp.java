
public class P18_MultipleExp {  
  
    public static void main(String[] args) {  
          
           try{    
           		
           		String s = null;
                int a[]=new int[5];    
                a[5]=30/0;    
               	s.length();
               }    
               
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               
               	catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }   
                  
                  catch (NullPointerException e) {
                   System.out.println("NullPointerException occurs");    	
                   } 

               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  