import java.util.Scanner;
class TestDemo
{   
	public static void main(String[] args)
	{  // int x=2;
		System.out.println(add(2));//3
	}
		static int add(int x)
		{
			//x++;
			if(x==1)
			return x;
		else
			return x +add(x-1);//2+1=3
		}



}
	/*private static char ch;
	public static void main(String[] args)
	{  
		Scanner scr= new Scanner(System.in);
		System.out.println("hello user enter the string: ");
	   String s=scr.nextLine();
	   int count=0;
	   for(int i=0;i<s.length();i++)
	    {
	   	 ch=s.charAt(i);
	   	 if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
	   	 	count++;
        }
        System.out.println(count);
	 
    }
}**/

        /*int a=3,b=4;
		a=a+b;//7
		b=a-b;//7-4=3
		a=a-b;//7-3=4
		System.out.println(a+"..............."+b);**/
		
		/*int a=3,b=4;//a=4,b=3;
		int c=0;
		c=a+b;//7
        a=c-a;//7-3=4
        b=c-b;//7-4=3
        System.out.println(a+"......."+b);


		


	}
}**/