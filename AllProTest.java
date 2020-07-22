import java.util.Scanner;
class AllProTest
{
	public static void main(String[] args)
	{  
       //average of n numbers
		int sum=0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may nos u have to find average: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter your no one by one: ");
		for(int i=0;i<num;i++)
		{
             arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			//System.out.print(arr[j]+" ");
            sum=sum+arr[j];
		}avg=sum/num;
		System.out.println(avg);

	}
}
