package collectionprogram;
import java.util.*;
class DemoCollectionProgram
{   
	static int[] arr;
	private static double arr_size;

	DemoCollectionProgram()
	{
      arr.length=10;//10
      try{}
      catch(ArrayIndexOutOfBoundsException e)
      {
      	arr.length=((arr.length*arr_size)+1);//16
      }
	}
	public static void main(String[] args)
	{   Scanner scr= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=scr.nextInt();
			System.out.print(arr[i]+" ");
		}
        System.out.println("default size "+arr.length);
	}
}

	/*{
		ArrayList l=new ArrayList();
		ArrayList l1=new ArrayList();
		l.add('a');
		l.add(null);
		l.add(1);
		l.add('Z');
		l.add(1.5);
		l1.addAll(l);
		//System.out.println(l+" "+l1);
		//l.addAll(l);
		//
		//l1.removeAll(l);
		//System.out.println(l+" "+l1);
		l.retainAll(l);
		System.out.println(l+" "+l1);
	}
}**/
	/*{  //int p=0;
		char ch='A';//65
		//p=ch;
       ArrayList l=new ArrayList();
       for(int i=0;i<12;i++)
       {
       	l.add(ch);
       	ch++;
       }
       	System.out.println("Enter char is : "+l);//A B C D E F G H I J
       
	}
}**/