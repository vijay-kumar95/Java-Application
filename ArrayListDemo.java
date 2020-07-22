import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
     ArrayList l=new ArrayList();
     l.add("A");
     l.add(10);
     l.add(null);
     l.add("A");
     System.out.println(l);//[A,10,null,A]
     l.remove(2);
     System.out.println(l);//[A,10,A]
     l.add(2,"C");
     l.add("N");
     System.out.println(l);//[A,10,C,A,N]
	}
}