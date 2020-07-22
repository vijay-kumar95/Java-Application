package exceptionpro;
import java.lang.*;
class ExceptionDemo1
{   
	private static String s=null; 
	private  static int l=0,m=10,n=0,o=0; 
	public static void main(String[] args)
   { 
   	   System.out.println("hiiiiiiiiii");
     try
   	 {
      Thread.sleep(10000);
     }
     catch(InterruptedException e) 
      {
    	
      }System.out.println("waiting time of main thread is over");
   


   /* System.out.println("hiiiiiiiiii");
   	Thread.sleep(10000);
   	System.out.println("waiting time of main thread is over");**/
   	

    }
}	
/*{
		throw new NullPointerException();
		//System.out.println(s.length());//java.lang.ArithmeticException:
		//throw new ArithmeticException("/by zero");
		//System.out.println(10/0);//java.lang.ArithmeticException:
	}**/

    /* try
     {
       l=s.length();
       //o=m/n;
     }
      catch(NullPointerException e)
     {
     	System.out.println("Default assinged value inside string S: ");
     }
     try
     {
       //l=s.length();
       o=m/n;
     }
    
     catch(ArithmeticException e1)
     {
     	System.out.println("Not vallied result:");
     }**/
	
