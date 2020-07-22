//Sorting program without using any standard method
import java.util.Scanner;
class Test
{
 public static void main(String[] args)
	{  
	int[] arr=new int[5] ; 
	  Scanner scn=new Scanner(System.in);
	  System.out.println("Enter the element: ");
	  for(int i=0;i<arr.length;i++)
	  {
	  	arr[i]=scn.nextInt();
	  }
      
	  Test t=new Test();
      t.maxvalue(arr);
     

	}
   public void maxvalue(int[] copy)
     {
       int a;
       a=copy[0];
       for(int i=1;i<copy.length;i++)
       {
       	if(a<copy[i])
       		a=copy[i];
       }
       System.out.println(a);
     }


}
