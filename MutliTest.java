import java.util.Scanner;
class MutliTest
{
	public static void main(String[] args)
	{     int count=0;
		 Scanner scr=new Scanner(System.in);
	     int[] arr=new int[5];
	     System.out.println("Enter the no: ");
	     for(int i=0;i<5;i++)
	     {
          arr[i]=scr.nextInt();

	     }
	     for(int j=0;j<(arr.length);j++)
	     {
	     	if((arr[j]%3)==0)
	     		count++;
	     }System.out.println("Result is: "+count);
	}
}