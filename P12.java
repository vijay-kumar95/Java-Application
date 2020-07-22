import java.util.Scanner;
class P12
{
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       int str;
       int n;
       System.out.println("Enter the Start point:");
       str=sc.nextInt();
       System.out.println("Enter the value of n:");
       n=sc.nextInt();
       for(int i=str;i<(str+n);i++)
       {
           for(int j=(n-1);j<=1;j--)
           {
           System.out.print(i);
           }
         System.out.println(" ");

       }
	}
}