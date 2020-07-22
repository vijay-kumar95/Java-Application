import java.util.Scanner;
class LengthyPro
{
	public static void  main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str=scr.nextLine();
		char ch;
		for(int i=0;i<str.length();i++)
		{
           ch=str.charAt(i);
           System.out.println(ch);
		}
	}
}

// { //8.two different array Combine in one large array
// 	  public static void main(String[] args)  
// 	  { 
//          int[] a={1,2,3};
//          int[] b={6,9};
//          int l1=a.length;//3
//            int l2=b.length;
//            int l3=l1+l2;//5
//            int[] c=new int[l3];
//          for(int i=0;i<l3;i++)
//          {
//             if(i<l1)
//             {
//             	c[i]=a[i];
//             }
//             else
//             	c[i]=b[i-3];
            

//          }
//          for(int i=0;i<l3;i++)
//          {
//          	System.out.print(c[i]+" ");
//          }
       
//       }

// } 
// { //7.sum of the array element
// 	  public static void main(String[] args)  
// 	  { 
//          int sum=0;
//         int a[]= {7,3,1,6,4,8,9}; 
     
//         for(int i=0;i<a.length;i++)
//         {   
//           sum+=a[i];
//         } System.out.println("sum of the array is : "+sum);//38
       
//       }

// } 
// { //6.smallest index of element
// 	  public static void main(String[] args)  
// 	  { 
//          int si=0;
//         int a[]= {7,3,1,6,4,8,9}; 
     
//         for(int i=0;i<a.length;i++)
//         {   
//           if(a[i]<a[si])
//           {
//           	si=i;
//           }
//         } System.out.println("smallest index of is : "+si);
       
//       }

// } 
// { //5. find SmallestAndLargestNumber in an array
// 	  public static void main(String[] args)  
// 	  { 
//          int i;
// 	  	int largest=0,smallest=0;
//         int[] a= {-88,56,78,96,56749}; 
     
//         for(i=0;i<a.length;i++)
//         {     
//         	if(a[i]<smallest)
//         	{
//               smallest=a[i];
//         	}
//         	 else if(a[i]>largest)
//         	 {
//         	 	largest=a[i];
//         	 }
//         } 
//        System.out.println("Largest number is: "+largest);
//        System.out.println("Smallest number is: "+smallest);
//       }

// } 
// { //4.question from increment /decrement operator
// 	  public static void main(String[] args)  
// 	  { 
//               int i=1;
//               int a= ++i + i++ + --i;//2+2+2=6
//               System.out.println(a);
//               int j=2;
//               int b= --j + j-- + ++j;//1+1+1=3
//                System.out.println(b);
//                int k=3;
//                int c = ++k + --k + ++k + k++ + k-- +(k+1) + k++;//4+3+4+4+5+5+4=29
//               System.out.println(c);

//      }

//  } 
// { //3.check given number is perfect square or not. 
// 	public static void main(String[] args)
// 	{   
// 		double d=8100;
// 		double square=Math.sqrt(d);
// 		if((square-Math.floor(square))==0)
// 		{
// 			System.out.println("Number is perfect sqare "+square);
// 		}
// 		else
// 		{
// 			System.out.println("Not a Perfect sqare");
// 		}
// 	}
// }
// { //2. print duplicate element in an array 
// 	public static void main(String[] args)
// 	{   int n1=0,temp=0;
// 		int a[] ={6,10,5,4,9,120,4,6,10};
// 		int l=a.length;
// 		for(int i=0;i<l;i++)
// 		{   
// 			for(int j=i+1;j<l;j++)
// 			{
//               if(a[i]==a[j])
//               {
//                 System.out.print(a[i]+" ");
              
//               }
// 			}
			
// 		} 
// 	}
// }
// { //1.print unique element in an array 
// 	public static void main(String[] args)
// 	{   int j;
// 		int n1=0,temp=0;
// 		int a[] ={6,10,5,4,9,120,4,6,10};
// 		int l=a.length;
// 		for(int i=0;i<l;i++)
// 		{
// 			for(j=0;j<i;j++)
// 			{
//                  if(a[i]==a[j])
//                  	break;
// 			}
// 			if(i==j)
// 				System.out.print(a[i]+" ");
// 		}
		
// 	}
// }

// ====================================================================================================

// Array problems

// =======================================================================================================
// {   //7.Occurance of an array
// 	public static void main(String[] args)
// 	{   int count,r,maxcount=0,temp=0,m=0;
// 		String s="";
// 		int a[]= {111111,11111,1111111,1111111111,111111};
// 		int l=a.length;
// 		int[] b=new int[l];
// 		for(int i=0;i<l;i++)
// 		{  
// 		    b[i]=a[i];
// 			count=0;
// 			r=0;
// 			while(a[i]>0)
// 			{
// 				r=a[i]%10;
// 				count+=1;
// 				a[i]=a[i]/10;
// 			}

//            System.out.println(b[i]+"<-----Occurance of that element is----->"+count);
//            if(maxcount<count)
//            { m=i; 
//            	temp=count;
//            	count=maxcount;
//            	maxcount=temp;
//            	b[m]=b[i];
//            }
//         }
//         System.out.println(b[m]+"<-----Maximum Occurance is----->"+maxcount);
//     }
// }
// {   //6.missing element in an Array
// 	public static void main(String[] args)
// 	{   int actual_size=0,actual_sum=0;
// 		Scanner sc=new Scanner(System.in);
// 	    System.out.println("Enter array size ");
// 		int size=sc.nextInt();
// 		int[] a=new int[size];
// 		System.out.println("Enter array element");
// 		for(int i=0;i<size;i++)
// 		{ 
//           a[i]=sc.nextInt();
//         }
//            actual_size=size+1;
//            actual_sum=((actual_size)*(actual_size+1))/2;
//         int given_sum=0;
//         for(int i=0;i<size;i++)
//         {
//         	given_sum+=a[i];
//         }
//         int missing_term=actual_sum-given_sum;
//         System.out.println("Missing number is: "+missing_term);


        
		
// 	}
// }
// {   //5.Matrix multiplication
// 	public static void main(String[] args)
// 	{   
// 		String s1="",s2="";
// 		Scanner sc=new Scanner(System.in);
	
// 		System.out.println("Enter array size rows or column(Square matrix)");
// 		int r=sc.nextInt();
// 		int c=r;
//         int[][] a=new int[r][c];
// 		int[][] b=new int[r][c];
// 		int[][] sum=new int[r][c];
// 		System.out.println("Enter first matrix element");
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	a[i][j]=sc.nextInt();
//           }
// 		}
//         System.out.println("Enter second matrix element");
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	b[i][j]=sc.nextInt();
//           }
// 		}
		
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	sum[i][j]=a[i][j]*b[i][j];
//           }
// 		}
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	System.out.print(sum[i][j]+" ");
//           }
// 		}
		
// 	}
// }
// {   //4.Matrix Addition
// 	public static void main(String[] args)
// 	{   
// 		String s1="",s2="";
// 		Scanner sc=new Scanner(System.in);
	
// 		System.out.println("Enter array size rows or column(Square matrix)");
// 		int r=sc.nextInt();
// 		int c=r;
//         int[][] a=new int[r][c];
// 		int[][] b=new int[r][c];
// 		int[][] sum=new int[r][c];
// 		System.out.println("Enter first matrix element");
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	a[i][j]=sc.nextInt();
//           }
// 		}
//         System.out.println("Enter second matrix element");
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	b[i][j]=sc.nextInt();
//           }
// 		}
		
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	sum[i][j]=a[i][j]+b[i][j];
//           }
// 		}
// 		for(int i=0;i<r;i++)
// 		{ 
//           for(int j=0;j<c;j++)
//           {
//           	System.out.print(sum[i][j]+" ");
//           }
// 		}
		
// 	}
// }
// {   //3. even or odd sorting
// 	public static void main(String[] args)
// 	{   
// 		String s1="",s2="";
// 		Scanner sc=new Scanner(System.in);
	
// 		System.out.println("Enter array size");
// 		int l1=sc.nextInt();
// 		int[] a=new int[l1];
// 		System.out.println("Enter array element");
// 		for(int i=0;i<l1;i++)
// 		{
//            a[i]=sc.nextInt();
// 		}
// 		for(int i=0;i<l1;i++)
// 		{
// 			if(a[i]%2==0)
// 			{
//                 s1+=a[i]+" ";
// 			}
// 			else
// 			{
//                s2+=a[i]+" ";
// 			}
// 		}
// 		System.out.println(s1+" "+s2);
		
		
		


// 	}
// }
// {   //2. Common element between two Array
// 	public static void main(String[] args)
// 	{   
// 		Scanner sc=new Scanner(System.in);
	
// 		System.out.println("Enter first array size");
// 		int l1=sc.nextInt();
// 		System.out.println("Enter second array size");
// 		int l2=sc.nextInt();
// 		int[] a=new int[l1];
// 		int[] b=new int[l2];
// 		System.out.println("Enter first array element");
// 		{
// 			for(int i=0;i<l1;i++)
// 			{
//               a[i]=sc.nextInt();
// 			}
// 		}
// 		System.out.println("Enter second array element");
// 		{
// 			for(int i=0;i<l2;i++)
// 			{
//               b[i]=sc.nextInt();
// 			}
// 		}

//        for(int i=0;i<l1;i++)
//        {  
//        	for(int j=0;j<l2;j++)
//        	{
//           if(a[i]==b[j])
//           {
//            System.out.println("Common element of that array is:"+a[i]+" ");
//           }

//        	}
//        }


// 	}
// }
// {   //1.Bubble Sorting
// 	public static void main(String[] args)
// 	{
// 		int temp=0;
// 		int[] a={4,8,0,3,2,6,1};
// 		int len=a.length;
//     	for(int j=0;j<7;j++)
// 		{
// 			System.out.print(a[j]+" ");
// 		}
// 		System.out.println();
// 		for(int i=0;i<len-1;i++)
// 		{
// 			for(int j=0;j<len-1-i;j++)
// 			{
// 				if(a[j]>a[j+1])
// 				{
//                  temp=a[j+1];
//                  a[j+1]=a[j];
//                  a[j]=temp;
// 				}
// 			}
// 		}


// 		for(int j=0;j<7;j++)
// 		{
// 			System.out.print(a[j]+" ");
// 		}
// 	}
// }