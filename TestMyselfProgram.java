import java.util.Scanner;
public class TestMyselfProgram
{
    public static void main(String[] args)
    {
    }
}

// // {/*   
   
// //     public static void main(String[] args)
// //     {
// //          int m,temp=0;
// //        for(int i=40;i<=60;i++)
// //        {
// //          m=i;
// //          for(int j=2;j<=m-1;j++)
// //          {
// //             if(m%j==0)
// //             {
// //                 temp=1;
// //             }
// //          }
// //          if(temp==0)
// //          {
// //           System.out.print(i+" ");
// //          }
// //          else
// //             temp=0;
// //        }

// //     }
// // }







// // {  //merging of two arrays
// // 	public static void main(String[] args)
// // 	{
// // 		int[] a={1,2};
// // 		int[] b={3,4,5};
// // 		int[] c=new int[5];
// // 		for(int i=0;i<5;i++)
// // 		{
			
// // 			if(i<=1)
// // 			{
// // 				c[i]=a[i];
				
// // 			}
// // 			else
// // 				c[i]=b[i-2];
// // 		}
// // 		for(int j=0;j<5;j++)
// // 		{
// // 			System.out.print(c[j]+" ");
// // 		}
// // 	}

// // }
// // ================================================================================================

// // series pattern

// // ================================================================================================
// // {  //5.series patteren
// // 	public static void main(String[] args)
// // 	{  
// // 		int a=3, b=4;
// // 		for(int i=1;i<=20;i++)
// // 		{
// // 			if(i%2!=0)
// // 			{
// // 				System.out.print(a+" ");
// //                 a=a+4;
// // 			}
// // 			else
// // 			{
// // 				System.out.print(b+" ");
// //               	b=b+4;
// // 			}
// // 		}
// //     }
// // }
// // {  //4.series patteren
// // 	public static void main(String[] args)
// // 	{  
// // 		int a=36, b=34;
// // 		for(int i=1;i<=20;i++)
// // 		{
// // 			if(i%2!=0)
// // 			{
// // 				System.out.print(a+" ");
// //                 a=a-6;
// // 			}
// // 			else
// // 			{
// // 				System.out.print(b+" ");
// //               	b=b-6;
// // 			}
// // 		}
// //     }
// // }
// // {  //3.series patteren
// // 	public static void main(String[] args)
// // 	{  
// // 		int a=7,b=10;
// // 		for(int i=1;i<=20;i++)
// // 		{
// // 			if(i%2!=0)
// // 			{
// // 				System.out.print(a+" ");
// //                 a++;
// // 			}
// // 			else
// // 			{

// // 				System.out.print(b+" ");
// //                 b++;	
// // 			}
// // 		}
// //     }
// // }
// // {  //2.series patteren
// // 	public static void main(String[] args)
// // 	{  
// // 		for(int i=1;i<=10;i++)
// // 		{
// // 			if(i%2!=0)
// // 				System.out.print(i+" ");
// // 		}
// //     }
// // }
// // {  //1.series patteren
// // 	public static void main(String[] args)
// // 	{  
// // 		for(int i=1;i<=10;i++)
// // 		{
// // 			if(i%2==0)
// // 				System.out.print(i+" ");
// // 		}
// //     }
// // }
// // ==================================================================================================

// // Number pattern

// // ===================================================================================================
// // {  //18.Number patteren
// // 	public static void main(String[] args)
// // 	{  int a=1;
// //         for(int i=1;i<=5;i++)
// //         {
// //         	for(int j=1;j<=5;j++)
// //         	{   
// //         		if(j<=i)
// //         		{
// //         		    System.out.print(a+" ");
// //         		     a++;
// //         		}
// //                 else
// //         		    System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         	a--;
// //             a++;
// //         }	
        
        
// //     }
// // }
// // {  //17.Number patteren
// // 	public static void main(String[] args)
// // 	{  int a=1,b=4;
// //         for(int i=1;i<=3;i++)
// //         {
// //         	for(int j=1;j<=4;j++)
// //         	{   
// //         		if(j>=5-i&&j<=4)
// //         		    System.out.print(a+" ");
// //                 else
// //         		    System.out.print(" ");
// //         	}
// //         	System.out.println();
// //             a++;
// //         }	
// //         for(int i=1;i<=4;i++)
// //         {
// //         	for(int j=1;j<=4;j++)
// //         	{   
// //         		if(j>=i)
// //         		    System.out.print(b+" ");
// //                 else
// //         		    System.out.print(" ");
// //         	}
// //         	System.out.println();
// //             b--;
// //         }
        
// //     }
// // }
// // {  //16.Number patteren
// // 	public static void main(String[] args)
// // 	{

// // 	   for(int i=1;i<=5;i++)
// //           {
// //             int l=4,k=i;	
// //            for(int j=1;j<=i;j++)	
// //            {
// //                 System.out.print(k+" ");
// //                 k=k+l;
// //                 l--;
// //            }
// //            System.out.println();;
// //           }

// //     }
// // }
// // {  //15.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num1=0,num2=0;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(i==j)
// //         		{
// //         			System.out.print(num1);
// //         			num1=num1+1;
        		     	
// //         		}       		
        			
// //         		else
// //         			System.out.print(num2);
// //         	}
// //         	System.out.println();
        
// //         }	
        
// //     }
// // }
// // {  //14.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num1=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j>=8-i&&j<=7)
// //         		{
        			
// //         			System.out.print(i);
        		     	
// //         		}       		
        			
// //         		else
// //         			System.out.print(num1);
// //         	}
// //         	System.out.println();
        
// //         }	
        
// //     }
// // }
// // {  //13.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num1=1,num2=0;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if((i+j)%2==0)
// //         		{
        			
// //         			System.out.print(num1);
        		     	
// //         		}       		
        			
// //         		else
// //         			System.out.print(num2);
// //         	}
// //         	System.out.println();
        
// //         }	
        
// //     }
// // }
// // {  //12.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num1=1,num2=7;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j>=i)
// //         		{
        			
// //         			System.out.print(num1+" ");
// //         		    num1++;
        		     	
// //         		}       		
        			
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         	num1=i+1;
// //         }	
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j>=8-i&&j<=7)
// //         		{
        			
// //         			System.out.print(num2+" ");
// //         		    num2++;
        		     	
// //         		}       		
        			
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         	num2-=i+1;
// //         }	
        
        	 
        
// //     }
// // }
// // {  //11.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num1=1,num2=0;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         		{
// //         			if(j%2!=0)
// //         			System.out.print(num1);
// //         		    else
// //         		    System.out.print(num2);  	
// //         		}       		
        			
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
        	
// //         }	
        
        	 
        
// //     }
// // }
// // {  //10.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         		{
// //         			System.out.print(num);
// //         		    num--;
// //         		}
        			
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         	 num=i+1;;
// //         }	
        
        	 
        
// //     }
// // }
// // {  //9.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=0;i<=6;i++)
// //         {
// //         	for(int j=1;j<=13;j++)
// //         	{   
// //         		if(j<=(2*i+1))
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         				if((j)==i+1) 
// //                         {
// //                          num--;
// //                          num--;
// //                         }
                          
// //         	        }	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;;
// //         }	
        
        	 
        
// //     }
// // }
// // {  //8.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=6;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=8-i)
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;;
// //         }	
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;;
// //         }	 
        	 
        
// //     }
// // }
// // {  //7.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=7;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=8-i)
// //         			{
// //         				System.out.print(num);
// //         				num--;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=7-i;;
// //         }	 
        	 
        
// //     }
// // }
// // {  //6.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=7;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         			{
// //         				System.out.print(num);
// //         				num--;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=7;
// //         }	 
        	 
        
// //     }
// // }

// // {  //5.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=7;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=8-i)
// //         			{
// //         				System.out.print(num);
// //         				num--;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=7;
// //         }	 
        	 
        
// //     }
// // }
// // // {  //4.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=8-i)
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;
// //         }	 
        	 
        
// //     }
// // }
// // {  //3.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;
// //         }	 
// //         	 for(int m=1;m<=6;m++)
// //         	 {
// //         	 	for(int n=1;n<=6;n++)
// //         	 	{
// //                   if(n<=7-m)
// //                   {
// //                   	System.out.print(num);
// //                   	num++;
// //                   }	
// //         	 	}
// //         	 	System.out.println();
// //         	 	num=1;
// //         	 }
        
// //     }
// // }
// // {  //2.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         			{
// //         				System.out.print(num);
        				
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num+=1;
// //         }
// //     }
// // }
// // {  //1.Number patteren
// // 	public static void main(String[] args)
// // 	{  int num=1;
// //         for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<=7;j++)
// //         	{   
// //         		if(j<=i)
// //         			{
// //         				System.out.print(num);
// //         				num++;
// //         			}	

// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
// //         	 num=1;
// //         }
// //     }
// // }
// // ===============================================================================================

// // star pattern

// // ===============================================================================================
// // {  //8.patteren
// // 	public static void main(String[] args)
// // 	{ 
// //         for(int i=1;i<=9;i++)
// //         {
// //         	for(int j=1;j<=9;j++)
// //         	{   
// //         		if(j>=10-i&&j<=9)
// //         			System.out.print("* ");
// //         		else
// //         			System.out.print(" ");
// //         	}System.out.println();
        	
// //         }
// //     }
// // }
// // {  //7.patteren
// // 	public static void main(String[] args)
// // 	{ 
	  
// // 	    for(int i=1;i<=7;i++)
// //         {
// //           for(int j=1;j<=7;j++)
// //           {
// //           	if(i>=2&&i<=6)
// //           	{
// //           		if(j>=2&&j<=6)
// //           		{
// //           			System.out.print(" ");
// //           		}
// //           		else
// //           		{
// //           			System.out.print("*");
// //           		}
// //           	}
// //           	else
// //           	{
// //           		System.out.print("*");
// //           	}
// //           }
// //           System.out.println();
// //         }
        
// //     }
// // }
// {  //6.patteren
//    //  public static void main(String[] args)
//    //  {  
//    //      for(int i=1;i<=9;i++)
//    //      {
//    //          if(i<=5)
//    //          {
//    //              for(int j=1;j<5;j++)
//    //              {   
//    //                 if(j>=6-i)
//    //                 {
//    //                  System.out.print("*");
//    //                  }               
//    //                  else
//    //                   System.out.print(" ");
//    //              }
//    //              for(int j=5;j<=9;j++)
//    //              {   
//    //                 if(j<=i+4)
//    //                  {
//    //                   System.out.print("*");
//    //                  }               
//    //                 else
//    //                    System.out.print(" ");
//    //              }
//    //              System.out.println();
//    //          }
//    //          else
//    //          {
//    //              for(int j=1;j<5;j++)
//    //              {   
//    //                 if(j>=i-4)
//    //                 {
//    //                  System.out.print("*");
//    //                  }               
//    //                  else
//    //                   System.out.print(" ");
//    //              }
//    //              for(int j=5;j<=9;j++)
//    //              {   
//    //                 if(j<=14-i)
//    //                  {
//    //                   System.out.print("*");
//    //                  }               
//    //                 else
//    //                    System.out.print(" ");
//    //              }
//    //              System.out.println();
//    //          }
            
//    //     } 
//    // }
// }  
 
// // {  //5.patteren
// // 	public static void main(String[] args)
// // 	{  
// // 	    for(int i=1;i<=7;i++)
// //         {
// //         	for(int j=1;j<7;j++)
// //         	{   
// //         		if(j>=8-i&&j<7)
// //         			System.out.print("*");
// //         		else
// //         			System.out.print(" ");
// //         	}
        	
// //         	 for(int k=7;k<=13;k++)
// //         	 { 
// //         	 	if(k<=6+i)
// //                System.out.print("*");
// //                else
// //                	System.out.print(" ");
// //         	 }
        	
// //         	System.out.println();
// //         }
// //     }
// // }
// // {  //4.patteren
// // 	public static void main(String[] args)
// // 	{  
// // 	    for(int i=1;i<=5;i++)
// //         {
// //         	for(int j=1;j<=5;j++)
// //         	{   
// //         		if(j>=i)
// //         			System.out.print("*");
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         }
// //     }
// // }
// // {  //3.patteren
// // 	public static void main(String[] args)
// // 	{  
// // 	    for(int i=1;i<=5;i++)
// //         {
// //         	for(int j=1;j<=5;j++)
// //         	{   
// //         		if(j>=6-i&&j<=5)
// //         			System.out.print("*");
// //         		else
// //         			System.out.print(" ");
// //         	}
// //         	System.out.println();
// //         }
// //     }
// // }
// // {  //2.patteren
// // 	public static void main(String[] args)
// // 	{  
// // 	    for(int i=1;i<=5;i++)
// //         {
// //         	for(int j=1;j<=6-i;j++)
// //         	{
// //         		System.out.print("*");
// //         	}
// //         	System.out.println();
// //         }
// //     }
// // }
// // {  //1.patteren
// // 	public static void main(String[] args)
// // 	{  
// // 	    for(int i=1;i<=5;i++)
// //         {
// //         	for(int j=1;j<=i;j++)
// //         	{
// //         		System.out.print("*");
// //         	}
// //         	System.out.println();
// //         }
// //     }
// // }
// //========================================================================================

// //Programs on Loops(while,do while, for)

// //========================================================================================
// // {  //32.Write a program to convert a binary number to decimal number
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the binary number ");
// //         int num=scr.nextInt();
// //         int i=1,decimal=0,r=0;
        
// //         while(num>0)
// //         {
// //         	r=num%10;
// //         	decimal+=r*i;
// //         	num=num/10;
// //         	i*=2;
// //         }
// //         System.out.println("Decimal equilvalent is: "+decimal);
        
        
// //     }
    	   	   
// // }
// // {  //31.Write a program to print N co-prime numbers
// // 	public static void main(String[] args)
// // 	{  
        
// //     }
    	   	   
// // }
// // {  //30.Write a program to check co-prime number
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the two nos: ");
// //         int a=scr.nextInt();
// //         int b=scr.nextInt();
// //         int temp=0;
// //         for(int i=2;(i<a&&i<b);i++)
// //         {
// //            if(a%i==0&&b%i==0)
// //            	temp=1;

// //         }
// //         if(temp==0)
// //         	System.out.print("Given Pair is Co-prime "+a+","+b);
// //         else
// //         {  
// //         	System.out.print("Given Pair is not Co-prime "+a+","+b);
// //         	temp=0;
// //         }
        
// //     }
    	   	   
// // }
// // {  //29.Write a program to print first N terms of Fibonacci series
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the two nos: ");
// //         int a=scr.nextInt();
// //         int b=scr.nextInt();
// //         int c=0;
// //         System.out.print(a+" ");
// //         System.out.print(b+" ");
// //        // c=a+b;
// //         for(int i=1;i<=8;i++)
// //         {
// //            c=a+b;
// //            System.out.print(c+" ");
// //            a=b;
// //            b=c;

// //         }
// //     }
    	   	   
// // }
// // }
// // {  //28.Write a program to print all prime factors of a given number. For example prime factors of 36 are 2,2,3,3
// // 	public static void main(String[] args)
// // 	{  
// // 	   Scanner sc=new Scanner(System.in);
// // 	   System.out.println("Enter the number");
// // 	   int n=sc.nextInt(); 
// // 	   for(int i=2;i>=2;i++)
// // 	   {
// // 	   	while(n%i==0)
// // 	   	{
// // 	   		System.out.print(i+" ");
// // 	   		n=n/i;
// // 	   	}
// // 	   }
	   
// // 	}
// // }  
	    
	   
// // 	}
// // }
// // {  //27.Write a program to print all prime numbers between two given numbers
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the range of the number  (a to b)  : ");
// //         int num1=scr.nextInt();
// //         int num2=scr.nextInt();
// //         int temp=1;
// //         for(int i=num1;i<=num2;i++)
// //         { 
// //           for(int j=2;j<num1;j++)
// //           {
// //             	if(i%j==0)
// //         		temp=0;
// //           }
// //           if(temp==1)
// //           System.out.print(i+" ");
// //           else
// //       	  temp=1;
// //         }
    	    
	   
// // 	}
// // }
// // {  //26.Write a program to check whether a given number is prime or not
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number num : ");
// //         int num=scr.nextInt();
// //         int temp=1;
// //         for(int i=2;i<num;i++)
// //         {
// //         	if(num%i==0)
// //         		temp=0;
// //         }
// //         if(temp==1)
// //         	System.out.println("Given number is Prime "+num);
// //         	else	
// //         		System.out.println("Given number is not a Prime "+num);
        
        
    	    
	   
// // 	}
// // }
// // {  //25.Write a program to calculate HCF of two numbers.
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the two numbers a, b : ");
// //         int a=scr.nextInt();
// //         int b=scr.nextInt();
// //         int LCM=0,HCF=0;
// //         for(int i=1;(i<=a&&i<=b);i++)
// //         {
// //         	if(a%i==0&&b%i==0)
// //         			HCF=i;
// //         }
        
// //         System.out.println("HCF of the number is "+HCF);
    	    
	   
// // 	}
// // }
// // {  //24.Write a program to calculate LCM of two numbers
// // 	public static void main(String[] args)
// // 	{  
// // 	    Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the two numbers a, b : ");
// //         int a=scr.nextInt();
// //         int b=scr.nextInt();
// //         int LCM=0,HCF=0;
// //         for(int i=1;(i<=a&&i<=b);i++)
// //         {
// //         	if(a%i==0&&b%i==0)
// //         			HCF=i;
// //         }
// //         LCM=a*b/HCF;
// //         System.out.println("LCM of the number is "+LCM);
    	    
	   
// // 	}
// // }
// // {  //23.Write a program to print all Armstrong numbers under 1000.
// // 	public static void main(String[] args)
// // 	{   
// //         int r,s,n;
// //         for(int i=1;i<=1000;i++)
// //         { 
// //           s=0;
// //           r=0;
// //         	n=i;
// //           while(n>0)
// // 	      {  
// // 	    	r=n%10;
// // 	    	n=n/10;
// // 	    	s+=r*r*r;
// // 	      }
// // 	      if(s==i)
// //     	System.out.print(i+" ");    
// // 	   }
// // 	}
// // }
// // {  //21.Write a program to reverse a number
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number which u have to wish reverse(pallindrome): ");
// //         int num=scr.nextInt();
// //         int r=0,res=0;
// //         while(num>0)
// // 	    {  
// // 	    	r=num%10;
// // 	    	num=num/10;
// // 	    	res=res*10+r;
	       
// // 	    }
// //     	System.out.print("Result is "+res);    
	   
// // 	}
// // }
// // {  //20.Write a program to calculate sum of the digits of a given number
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number which u have to want (sum of the no of digits): ");
// //         int num=scr.nextInt();
// //         int r=0,res=0;
// //         while(num>0)
// // 	    {  
// // 	    	r=num%10;
// // 	    	res+=r;
// // 	        num=num/10;
// // 	    }
// //     	System.out.print("Result is "+res);    
	   
// // 	}
// // }
// // {  //19.Write a program to count digits in a given number.
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number which u have to want (no of digits): ");
// //         int num=scr.nextInt();
// //         int r=0,res=0;
// //         while(num>0)
// // 	    {  
// // 	    	r=num%10;
// // 	    	res+=1;
// // 	        num=num/10;
// // 	    }
// //     	System.out.print("Result is "+res);    
	   
// // 	}
// // }
// // {  //19.Write a program to count digits in a given number.
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number which u have to want (no of digits): ");
// //         int num=scr.nextInt();
// //         int r=0,res=0;
// //         while(num>0)
// // 	    {  
// // 	    	r=num%10;
// // 	    	res+=1;
// // 	        num=num/10;
// // 	    }
// //     	System.out.print("Result is "+res);    
	   
// // 	}
// // }
// // {  //18.Write a program to calculate x power y.(when user input x is 2 and y is 3 then the result will be 8)
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number x & y(x^y) wish to know about power: ");
// //         int x=scr.nextInt();
// //         int y=scr.nextInt();
// //         int res=1;
// //         for(int i=1;i<=y;i++)
// // 	    {  
// // 	       res*=x;
// // 	    }
// //     	System.out.print("Result is "+res);    
	   
// // 	}
// // }
// // {  //17.Write a program to calculate sum of first N odd natural numbers
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print addition of that odd number: ");
// //         int n=scr.nextInt();
// //         int res=0;
// //         for(int i=1;i<=n;i++)
// // 	    {  
// // 	     if(i%2!=0)
// // 	     	res+=i;
// // 	    }
// //     	System.out.print("Addition of the all even number is "+res);    
	   
// // 	}
// // }
// // {  //16.Write a program to calculate sum of first N even natural numbers
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print addition of that even number: ");
// //         int n=scr.nextInt();
// //         int res=0;
// //         for(int i=1;i<=n;i++)
// // 	    {  
// // 	     if(i%2==0)
// // 	     	res+=i;
// // 	    }
// //     	System.out.print("Addition of the all even number is "+res);    
	   
// // 	}
// // }
// // {  //15.Write a program to calculate factorial of a number
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print factorial of that number: ");
// //         int n=scr.nextInt();
// //         int t=1;
// //         for(int i=n;i>=1;i--)
// // 	    {  
// // 	     t*=i;
// // 	    }
// //     	System.out.print(t+" ");    
	   
// // 	}
// // }
// // {  //14.Write a program to calculate product of first N natural numbers(Factorial program)
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print multiplication upto that number: ");
// //         int n=scr.nextInt();
// //         int t=1;
// //         for(int i=n;i>=1;i--)
// // 	    {  
// // 	     t*=i;
// // 	    }
// //     	System.out.print(t+" ");    
	   
// // 	}
// // }
// // {  //13.Write a program to calculate sum of first N natural numbers 
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print Addition upto that number: ");
// //         int n=scr.nextInt();
// //         int sum=(n*(n+1))/2;
// // 	    System.out.print("Addition up to that is : "+sum);
	   
// // 	}
// // }
// // {  //12.Write a program to print table of user’s choice
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number you wish to print table of that number: ");
// //         int n=scr.nextInt();
// //         int t=0;
// // 		for(int i=1;i<=10;i++)
// // 	    {   t=i*n;
// // 	    	System.out.print(t+" ");
// // 	    }
// // 	}
// // }
// // {  //11.Write a program to print first N odd natural numbers in reverse order
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number upto you wish to print: ");
// //         int n=scr.nextInt();
// // 		for(int i=n;i>=1;i--)
// // 	    {   
// // 	    	if(i%2!=0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {  //10.Write a program to print first N even natural numbers in reverse order
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number upto you wish to print: ");
// //          int n=scr.nextInt();
// // 		for(int i=n;i>=1;i--)
// // 	    {   
// // 	    	if(i%2==0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {  //9.Write a program to print first N odd natural numbers.
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number upto you wish to print: ");
// //          int n=scr.nextInt();
// // 		for(int i=1;i<=n;i++)
// // 	    {   
// // 	    	if(i%2!=0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {  //8.Write a program to print first N even natural numbers.
// // 	public static void main(String[] args)
// // 	{    
// // 		Scanner scr=new Scanner(System.in);
// //         System.out.println("Enter the number upto you wish to print: ");
// //          int n=scr.nextInt();
// // 		for(int i=1;i<=n;i++)
// // 	    {   
// // 	    	if(i%2==0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {  //7.Write a program to print first 10 odd natural numbers.
// // 	public static void main(String[] args)
// // 	{  
// // 		for(int i=1;i<=20;i++)
// // 	    {   
// // 	    	if(i%2!=0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {  //6.Write a program to print first 10 even natural numbers
// // 	public static void main(String[] args)
// // 	{  
// // 		for(int i=1;i<=20;i++)
// // 	    {   
// // 	    	if(i%2==0)
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {
// //  //5.Write a program to print first N natural numbers in reverse order. (N is given by user)
// // 	public static void main(String[] args)
// // 	{   
// // 		Scanner scr=new Scanner(System.in);
// //    	    System.out.println("Enter the N natural number wish to print: ");
// //         int n=scr.nextInt();
// // 		for(int i=n;i>=1;i--)
// // 	    {
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {
// //  //4.Write a program to print first N natural numbers. (N is given by user)
// // 	public static void main(String[] args)
// // 	{   
// // 		Scanner scr=new Scanner(System.in);
// //    	    System.out.println("Enter the N natural number wish to print: ");
// //         int n=scr.nextInt();
// // 		for(int i=1;i<=n;i++)
// // 	    {
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {
// //  //3.Write a program to print first 10 natural numbers in reverse order.
// // 	public static void main(String[] args)
// // 	{   
// // 		for(int i=10;i>=1;i--)
// // 	    {
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {
// //  //2.Write a program to print first 10 natural numbers.
// // 	public static void main(String[] args)
// // 	{   
// // 		for(int i=1;i<=10;i++)
// // 	    {
// // 	    	System.out.print(i+" ");
// // 	    }
// // 	}
// // }
// // {
// //  //1.Write a program to print Your name 5 times on the screen. 
// // 	public static void main(String[] args)
// // 	{   
// // 		for(int i=0;i<5;i++)
// // 	    {
// // 	    	System.out.println("vijay verma");
// // 	    }
// // 	}
// // }
// // {
// //==========================================================================================

// //Programs on decision control(if,if else, switch)

// //==============================================================================================
// //  //6.Program to check leap year
// // 	public static void main(String[] args)
// // 	{   
// // 		 Scanner scr=new Scanner(System.in);
// // 		 System.out.println("Enter the year in the form of (yyyy) :");
// // 		 int year=scr.nextInt();
// // 		 if((year%4==0)||(year%100==0))
// // 		 	 System.out.println("Given Year is an Leap year :"+year);
// // 		 else
// // 		 	 System.out.println("Given Year is not Leap year :"+year);

// // 	}
// // }
// // {   //5.Write a program to find roots of a quadratic equation
// // 	public static void main(String[] args)
// // 	{   
// // 		int x1,x2;
// // 	  Scanner scr=new Scanner(System.in);
// // 		System.out.println("Enter the coefficient of x^2, x and constant ");
// // 		int a=scr.nextInt();
// // 		int b=scr.nextInt();
// // 		int c=scr.nextInt();
// // 		int D=((b*b)-(4*a*c));
// // 		if(D<0)
// // 		{
// // 			System.out.println("No Roots");
// // 		}
// // 		else if(D==0)
// // 		{
// //             System.out.println("Roots are real & equal");
// //             x1=(-b/(2*a));
// //             System.out.println("x1 "+x1+",x2 "+x1); 
     
// // 		}
// // 		else
// // 		{
// //           System.out.println("Roots are real & distinct");  
// //           x1=(-b+ sqrt(D))/(2*a);
// //           x2=(-b- sqrt(D))/(2*a);
// //           System.out.println("x1 "+x1+",x2 "+x2); 
// // 		}
		

// // 	}
// // }
// // {   //4.Write a program to to find greater among three numbers
// // 	public static void main(String[] args)
// // 	{   Scanner scr=new Scanner(System.in);
// // 		System.out.println("Enter Two nos: ");
// // 		int a=scr.nextInt();
// // 		int b=scr.nextInt();
// // 		int c=scr.nextInt();

// // 		if((a>b)&&(b>c))
// // 			System.out.println("Greatest number is "+a);
// // 		else if(b>c)
// // 			System.out.println("Greatest number is "+b);
// // 		else
// // 			System.out.println("Greatest number is "+c);

// // 	}
// // }
// // {   //3.Write a program to to find greater between two numbers
// // 	public static void main(String[] args)
// // 	{   Scanner scr=new Scanner(System.in);
// // 		System.out.println("Enter Two nos: ");
// // 		int a=scr.nextInt();
// // 		int b=scr.nextInt();

// // 		if(a>b)
// // 			System.out.println("Greatest number is "+a);
// // 		else
// // 			System.out.println("Greatest number is "+b);

// // 	}
// // }
// // {   //2.Write a program to check whether a given number is divisible by 5 or not.
// // 	public static void main(String[] args)
// // 	{
// // 		//int num=5;
// //      for(int i=1;i<=10;i++)
// //           {
// //           	if(i%5==0)
// //           		System.out.println("divisible "+i);
// //           	else
// //           		System.out.println("Not divisibel "+i);

// //           }

// // 	}
// // }
// // {   //1.Write a program to check whether a given number is even or odd
// // 	public static void main(String[] args)
// // 	{
// //      for(int i=1;i<=10;i++)
// //           {
// //           	if(i%2==0)
// //           		System.out.println("Even No "+i);
// //           	else
// //           		System.out.println("odd no "+i);

// //           }

// // 	}
// // }

// // {
// //=====================================================================================================

// //tricky programs

// //====================================================================================================


// // 	//4.Write a program to check even or odd without modulus and bitwise operator
// // 	public  static void main(String[] args)
// // 	{
// //           for(int i=1;i<=10;i++)
// //           {
// //           	if(((i/2)*2)==i)
// //           		System.out.println("Even No "+i);
// //           	else
// //           		System.out.println("odd no "+i);

// //           }

          
// // 	}
// // }
// // {
// // 	//3.Write a program to check whether a number is even or odd without using modulus(%) operator
// // 	public  static void main(String[] args)
// // 	{
// //           for(int i=1;i<=10;i++)
// //           {
// //           	if(((i/2)*2)==i)
// //           		System.out.println("Even No "+i);

// //           }

// //           for(int i=1;i<=10;i++)
// //           {
// //           	if(((i/2)*2)!=i)
// //           		System.out.println("odd no "+i);
          	
// //           }
// // 	}
// // }
// // {
// // 	//2.Write a program to swap two numbers without using third variable
// // 	public  static void main(String[] args)
// // 	{
// // 		int a=23,b=67;//a=67,b=23
// // 		System.out.println(a+"<---$before swaping value--->"+b);
// // 	    a=a+b;
// // 	    b=a-b;
// // 	    a=a-b;
// // 		System.out.println(a+"<---$after swaping value--->"+b);

// // 	}
// // }
// // {
// // 	//1.Write a program to swap two numbers
// // 	public  static void main(String[] args)
// // 	{
// // 		int a=23,b=67;//a=67,b=23
// // 		int temp=0;
// // 		System.out.println(a+"<---before swaping value--->"+b);
// // 		temp=a;//23
// // 		a=b;//67
// // 		b=temp;//23
// // 		System.out.println(a+"<---after swaping value--->"+b);

// // 	}
// // }