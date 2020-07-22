import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		int n3,term=5;
		System.out.println("Enter your first term in that Fibbonacci series: ");
		int n1=sc.nextInt();
		System.out.println("Enter number of term u want to print: ");
		int n2=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=2;i<term;i++)
		{   
		     n3=n1+n2;
			System.out.print(n3+"");
       n1=n2;
       n2=n3;		
       }

	}
}