import java.util.Arrays;
class InterviewQna
{  //Max of Min value from given arrays
	public static void main(String[] args)
	{   
		int[] a={53,89,65,2,80,156,354};
		int max=a[0];
		int min=a[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		for(int j=a.length-2;j>=0;j--)
		{
			if(min>a[j])
				min=a[j];
		}
		System.out.print(max+"<...max min...>"+min);//354 2
		
	}
}
// {  //Merging of two different arrays build a new arrays
// 	public static void main(String[] args)
// 	{   
// 		int[] a={10,20,30};
// 		int[] b={40,50,60,70,80};
// 		int a_len=a.length;
// 		int b_len=b.length;
// 		int c_len=a_len+b_len;
// 		int[] c=new int[c_len];
// 		for(int i=0;i<a_len;i++)
// 		{
// 			c[i]=a[i];
// 		}
// 		for(int j=0;j<b_len;j++)
// 		{
// 			c[a_len+j]=b[j];
// 		}
// 		for(int k=0;k<c_len;k++)
// 		{
// 			System.out.print(c[k]+" ");
// 		}
// 	}
// }
// {  //Duplicate charater from string
// 	public static void main(String[] args)
// 	{   int count=0;
// 		String str="programing";
// 		int len1=str.length();
// 		char[] ch=str.toCharArray();
		
// 		for(int i=0;i<len1;i++)
// 		{
// 			for(int j=i+1;j<len1;j++)
// 			{
// 				if((ch[i]==ch[j])&&(i!=j))
// 					System.out.print(ch[j]+" ");
				
// 			}
// 		}//System.out.println(count);
// 	}
// }
// {  // patttern 12
//    public static void main(String[] args)
//    { 
//    	int m=1;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j>=i)
//    			{
//    			     System.out.print(m);
//    			     m++;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}m=m-2;
//         for(int k=6;k<=9;k++)
//         {  
//         	if(k<=10-i)
//         	{
//         		System.out.print(m);
//         		m--;
//         	}
//         	 else
//         	 	System.out.print(" ");
//         }
//    		  m=1;
//    		 System.out.println();
//    	 }
//    }
// }
//    { pattern 11
//    	int m=1;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j>=6-i)
//    			{
//    			     System.out.print(m);
//    			     m++;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}
//    		 System.out.println();
//    	 }
//    }
// }
//     { //pattern 10
//    	int m=5;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j>=6-i)
//    			{
//    			     System.out.print(m);
//    			     m--;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}
//    		m=5;
//    		System.out.println();
//    	 }
//    }
// }
//    { //pattern 9
//    	int m=5;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j<=6-i)
//    			{
//    			     System.out.print(m);
//    			     m--;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}
//    		m=5;
//    		System.out.println();
//    	 }
//    }
// }
//  { //pattern 8
//    	int m=1;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j>=6-i)
//    			{
//    			     System.out.print(m);
//    			     m++;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}
//    		m=1;
//    		System.out.println();
//    	 }
//    }
// }  

//    { //pattern 7
//    	int m=1;
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   
//    			if(j<=i)
//    			{
//    			     System.out.print(m);
//    			     m++;
//    			}
//    			else
//    				 System.out.print(" ");
//    		}
//    		m=1;
//    		System.out.println();
//    	 }
//    }
// }   
   // pattern 6
//       for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=9;j++)
//    		{   
//    			if((j>=i)&&(j<=10-i))
//    			     System.out.print("*");
//    			else
//    				 System.out.print(" ");
//    		}
   		
//    		System.out.println();
//    	 }
//    }
// }   
//    { //pattern 5
//    	for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=9;j++)
//    		{   
//    			if((j>=6-i)&&(j<=4+i))
//    			     System.out.print("*");
//    			else
//    				 System.out.print(" ");
//    		}
   		
//    		System.out.println();
//    	 }
//    }
// }

//    {  //pattern 4
      
//      for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   if(j>=i)
//    			    System.out.print("*");
//    			else
//    				System.out.print(" ");
//    		}
//    		System.out.println();
//    	 }
//    }
// }   
//    {//patteren 3
//      for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   if(j<=6-i)
//    			    System.out.print("*");
//    			else
//    				System.out.print(" ");
//    		}
//    		System.out.println();
//    	 }
//    }
// }
//    { //pattern 2
//    	 for(int i=1;i<=5;i++)
//    	 {
//    		for(int j=1;j<=5;j++)
//    		{   if(j>=6-i)
//    			    System.out.print("*");
//    			else
//    				System.out.print(" ");
//    		}
//    		System.out.println();
//    	 }
//    }
// }
//    {//patteren 1
//    	for(int i=1;i<=5;i++)
//    	{
//    		for(int j=1;j<=5;j++)
//    		{   if(i>=j)
//    			System.out.print("* ");
//    			else
//    				System.out.print(" ");
//    		}System.out.println();
//    	}
//    }
// }
// {
// 	public static void main(String[] args)
// 	{   
		
// 		int[] arr1=new int[10];
// 		int[] arr={2,1,5,3,7,4,8,6,10,9};//{1,2,3,4,5,6,7,8,9,10}
// 		  Arrays.sort(arr);
//           for(int i=0;i<arr.length;i++)
//           {  
//           	arr1[i]=arr[i];
          	
//           }
//           // for(int j=0;j<10;j++)
//           // {
//           // 	System.out.print(arr1[j]+" ");
//           // }
//           int start=0,end=9,sum=11;
//           while(start<end)
//             {
//              if(arr1[start]+arr1[end]>sum)
//           	  {
//           		end--;
//           	  }
//             else if(arr1[start]+arr1[end]<sum)
//           	  {
//           		start++;
//           	  }
//             else
//               {
//               	System.out.print("("+arr1[start]+","+arr1[end]+")"+" ");
//           	  start++;
//               }

//             }
// 	 }
// }
// {  //cross star patteren
// 	public static void main(String[] args)
// 	{
//        for(int i=0;i<5;i++)
//        {
//        	  for(int j=0;j<5;j++)
//        	  {
//        	  	if((i==j)||(i+j==4))
//                  System.out.print("*");
//        	  	else
//        	  		System.out.print(" ");
//        	  }
//        	  System.out.println();
//        }
// 	}
// }
// {   // finding power without using * or / operator
// 	public static void main(String[] args)
// 	{
//       //int result=
//       System.out.println("Required power of that number is: "+power(5,4));
// 	}
// 	 public static int power(int a, int b)//a=5,b=4//625
//       {  
//       	if(b==0)
//       		return 1;
//       	int answer=a;
//       	int increment=a;
//       	for(int i=1;i<b;i++)
//       	{
//       		for(int j=1;j<a;j++)
//       		{
//                answer+=increment;
//       		} increment=answer;
//       	} 
//       	return answer;
//       }
// }
//------------------------------------------------------------------
  // {//finding missing number in a given array by method (2)
  // 	public static void main(String[] args)
  // 	{
  //     int[] arr={1,2,3,4,6};//{1,2,3,4,5,6}
  //     int xor1=arr[0];
  //     int xor2=1;
  //     for(int i=1;i<arr.length;i++)
  //     {
  //     	xor1=xor1^arr[i];
  //     }
  //      for(int i=2;i<=arr.length+1;i++)
  //      {
  //      	xor2=xor2^i;
  //      }
  //      System.out.println("Missing number is: "+(xor1^xor2));
  // 	}
  // }
// {  //finding missing number in a given array by method (1)
 // 	public static void main(String[] args)
 // 	{
 //     int[] arr={1,2,3,4,6};
 //     int elen=arr.length+1;
 //     int expsum= (elen*(elen+1))/2;//21
 //     int sum=0;
 //     for(int i=0;i<arr.length;i++)
 //     {
 //     	sum=sum+arr[i];//16
 //     }
 //     System.out.println("Missing number is: "+(expsum-sum));//5

 // 	}
 // }
//-------------------------------------------------------------------------------

 // {  //string reverse using split method
 // 	 public static void main(String[] args)
 // 	 {
 // 	 	String str="I love java programing";//programing java love I
 // 	 	String[] arr=str.split(" ");
 // 	 	for(int i=arr.length-1;i>=0;i--)
 // 	 		System.out.print(arr[i]+" ");
 // 	 }
 // }
 // {
 // 	public static void main(String[] args)
 // 	{
 // 		int factnum=5,res=1;
 // 		for(int i=factnum;factnum>=1;factnum--)
 // 		{ 
 //           res*=factnum;
 // 		}  System.out.println("Factorial of that number is: "+res);
 // 	}
 // }
 


// {   //prime number
// 	public static void main(String[] args)
// 	{    
// 		int temp=0;
// 		for(int i=2;i<=100;i++)
// 		{
// 	        for(int j=2;j<=i-1;j++) 
// 	        {
// 	    	if(i%j==0)
// 	    		temp=temp+1;
// 	        }   
// 	            if(temp==0)
// 	            System.out.print(i+" ");
// 	            else
// 	        	temp=0;
//         }
// 	}
// }
// {  //Pallindrome Number
// 	public static void main(String[] args)
// 	{
// 		int a=125;
// 		int r,m=0,t=a;
// 		while(a!=0)
// 		{
// 			r=a%10;
// 			m=m*10+r;
// 			a=a/10;
// 		} if (t==m)
// 		     System.out.println("Pallindrome Number");
// 		     else
// 		   	 System.out.println("Usual Number");
// 	}
// }
//{   //Pallindrome string
// 	public static void main(String[] args) throws StringIndexOutOfBoundsException
// 	{
//         String str="Aapple";  //elppaA
//         String t=str,s="";
//         int len=str.length();
//         for(int i=len-1;i>=0;i--)
//         {
//         	s=s+s.charAt(i);
//         }
//           if(t.equals(s))
//           	System.out.println("Pallindrome String");
//           else
//           	System.out.println("Usual String");

// 	}
// }


// {   //Armstrong number
// 	public static void main(String[] args)
// 	{
//      int a=151;
//      int r,m=0,n=a;
//      while(a!=0)
//      {
//      	r=a%10;
//      	m+=r*r*r;
//      	a=a/10;
//      }
//      if(n==m)
//      	System.out.println("That number is Armstrong");
//      else
//      	System.out.println("Usual Number");
// 	}
// }


// //FibonaccieSeries 
// {
//    public static void main(String[] args)
//    {
//    	int a=0,b=1,c;
//    	System.out.print(a+" ");
//     System.out.print(b+" ");
//     for(int i=0;i<8;i++)
//     {
//     	c=a+b;
//     	System.out.print(c+" ");// 0 1 1 2 3 5 8 13 21  34
//     	a=b;
//     	b=c;
//     }
//    }
// } 