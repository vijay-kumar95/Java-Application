import java.util.Scanner;
class TestString
{
	public static void main(String[] args)
	{   
	     String s1,s2;
		Scanner scr=new Scanner(System.in);
        System.out.println("Enter two string: ");
        s1=scr.nextLine();
        s2=scr.nextLine();
		int len=s1.length();
		String s3=s1.substring(0,len/2);
		String s4=s1.substring(len/2);
		System.out.println(s3+s2+s4);
	}
}