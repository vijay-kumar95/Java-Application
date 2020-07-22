//revsere number without using standard method
import java.util.Scanner;
class T2
{
	public static void main(String[] args)
	{
		int num,result;
		T2 obj=new T2();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number: ");
        num= scn.nextInt();
        result= obj.reversalMethod(num);
        System.out.println(result);

 	}
 	public int reversalMethod(int a)
	{
     int reverse=0;
     while(a!=0)
     {
     	reverse=((reverse*10)+(a%10));
     	a=(a/10);
     }
     return reverse;
    }	

}