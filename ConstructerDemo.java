//cognizent paactice question
//package net.vijuvermasite40.www
import java.util.Scanner;
abstract public class ConstructerDemo//Cognizent practice
{

   public static void main(String[] args)
   {
    System.out.println("Hello user!");
   }   
}
// {   // find iut the largest & smallest number from arrays
// 	public static void main(String[] args)
// 	{   
// 		int largest=0,smallest=0;
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter size of array");
// 		int sz=scr.nextInt();
// 		int[] arr=new int[sz];
// 		System.out.println("Enter a Number in arrays");
// 		for(int i=0;i<sz;i++)
// 		{
// 			arr[i]=scr.nextInt();
// 		}
		
// 		for(int i=0;i<sz;i++)
// 		{
// 			if(arr[i]>largest)
// 			{
// 				largest=arr[i];
// 			}
// 			else if(arr[i]<smallest)
// 			{
// 				smallest=arr[i];
// 			}

// 		}
// 		System.out.println("Largest number is: "+largest+", Smallest number is: "+smallest);
// 	}
// }
// {   // Missing program 
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter size of array");
// 		int sz=scr.nextInt();
// 		int[] arr=new int[sz];
// 		System.out.println("Enter a Number in arrays");//167=761
// 		for(int i=0;i<sz;i++)
// 		{
// 			arr[i]=scr.nextInt();
// 		}
// 		int actsz=sz+1;
// 		int actsum=(actsz*(actsz+1))/2;
// 		int givsum=0,missnum=0;
// 		for(int i=0;i<sz;i++)
// 		{
// 			givsum+=arr[i];
// 		}
// 		missnum=actsum-givsum;
// 		System.out.println("missing number is "+missnum);
// 	}
// }
// {   // factorial program
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a Number");//167=761
// 		int a=scr.nextInt();// 40
// 		int i=0,res=1;
// 		for(i=a;i>0;i--)
// 		{
// 			res*=i;
// 		}
// 		System.out.println("factorial of the give Number is "+res);
		    
// 	}
// }
// {   // print prime number between  given range
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter range a(minumu) & b(maximun)");//167=761
// 		int a=scr.nextInt();// 40
// 		int b=scr.nextInt();// 60
// 		int i=0,j=0,temp=0;
// 		for(j=a;j<=b;j++)
// 		{
// 		    for(i=2;i<j;i++)
//             {
// 		     if(j%i==0)
// 		     	temp=1;
// 		    }	
// 		    if(temp==0)
// 			System.out.print(j+" ");	
// 	     	else
// 	     		temp=0;
// 	}
		
     
// 	}
// }
// {   //prime number check
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a numvber");//167=761
// 		int a=scr.nextInt();//
// 		int temp=0;
// 		for(int i=2;i<a;i++)
//         {
// 		     if(a%i==0)
// 		     	temp=1;
// 		}
//        if(temp==0)
// 			System.out.println("Given number is prime "+a);	
// 		else
// 			{
// 				System.out.println("Given number is not a prime "+a);
// 				temp=0;	
// 			}
// 	}
// }
// {   //pallindrome program  for string
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a string");//167=761
// 		String a=scr.nextLine();//
// 		int l=a.length();
// 		String r=a,b,s="";
// 		for(int i=l-1;i>=0;i--)
// 		{
// 			s+=a.charAt(i);
// 		}
//        if(r!=s)
// 			System.out.println("Given String is "+r+",That is Not a pallindrome "+s);	
// 		else
// 			System.out.println("Given number is "+r+",That is a pallindrome "+s);
// 	}
// }
// {   //pallindrome program
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a number");//167=761
// 		int a=scr.nextInt();//167
// 		int r=0,b=0,res=a;;
// 		while(a>0)
// 		{
//             r=a%10;
//             a=a/10;
//             b=b*10+r;

// 		}
// 		if(res!=b)
// 			System.out.println("Given number is "+res+",That is Not a pallindrome "+b);	
// 		else
// 			System.out.println("Given number is "+res+",That is a pallindrome "+b);
// 	}
// }
// {   //armstrong number check
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a number");
// 		int a=scr.nextInt();//167
// 		int r=0,b=0,res=a;;
// 		while(a>0)
// 		{
//             r=a%10;
//             b+=r*r*r;
//             a=a/10;

// 		}if(res==b)
// 		    System.out.println("Armstrong number");
// 		else
// 			System.out.println(" Not a Armstrong number");		
// 	}
// }
// {//Fibnnacie series
// 	public static void main(String[] args)
// 	{
// 		Scanner scr=new Scanner(System.in);
// 		System.out.println("Enter a two numbers");
// 		int a= scr.nextInt();
// 		int b=scr.nextInt();
// 		int c=0;
// 		System.out.print(a+" ");
// 		System.out.print(b+" ");
// 		for(int i=0;i<8;i++)
// 		{
// 			c=a+b;
// 			System.out.print(c+" ");
// 			a=b;
// 			b=c;
// 		}
// 	}
// }
// {
//    ConstructerDemo(String s)
//    {
//    	System.out.println("hello "+s);
//    }
//     ConstructerDemo(int m)
//    {
//    	System.out.println("Hiiii "+m);
//    }
//    public static void main(String[] args)
//    {
//      ConstructerDemo cd=new ConstructerDemo("vijay");

//    }   
// }