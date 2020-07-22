import java.util.Scanner;
class PallindromeP
{
	public static void main(String[] args)
	{   
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scr.nextLine();
		String s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);
		}
		if(str.equals(s1))
			System.out.println("Given String is palindrom");
		else
			System.out.println("Given string is not a palindrom");

	}
}
// {
// 	public static void main(String[] args)
// 	{  //pallindrome program for number
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter the number:");
// 		int n=scr.nextInt();
// 		int r,s=0;
// 		int t=n;
// 		while(n!=0)
// 		{
// 			r=n%10;
// 			n=n/10;
// 			s=s*10+r;
// 		}
// 		if(t==s)
// 			System.out.println("palindrom no");
// 		else
// 			System.out.println("not a palindrom");

// 	}
// }