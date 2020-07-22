import java.util.Scanner;
class ArJavaPro
{
	public static void main(String[] args)
	{
     
    Scanner scr=new Scanner(System.in);
    System.out.println("Enter any string: ");
	String s1= scr.nextLine();                                                  //"india is a great country";
	String[] arr=s1.split(" ");
	int len=arr.length;
	for(int i=0;i<len;i++)
	{  
	 if(i%2!=0) 
      System.out.print(arr[i].toUpperCase()+" ");
     else
        System.out.print(arr[i]+" ");
	}
	
	}
}