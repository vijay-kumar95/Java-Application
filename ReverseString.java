import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{    
	    String str;
		Scanner scr=new Scanner(System.in);
	    System.out.println("Enter Any string: ");
	    str=scr.nextLine();
		char[] arr=str.toCharArray();
		int len=arr.length;
		int a=len-1;
		for(int i=a;a>=0;a--)
		{ 
		   System.out.print(arr[a]);	
		}
		
		//System.out.println(len);
		

	}
}