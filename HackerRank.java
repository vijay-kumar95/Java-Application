import java.util.Scanner;
class HackerRank
{
	public static void main(String[] args)
	{  

     int a=0,b=2,n=5;
     int sum=a+b;
          		System.out.print(sum);

     for(int i=1;i<n;i++)
     {
            int sum1=(sum+((2^i)*b));
     		System.out.print(" "+sum1);
     }
	}
}