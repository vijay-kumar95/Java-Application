import java.util.*;
class TreeSetDemo5
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add("vijay");
		t.add("raju");
		t.add("aman");
		t.add("jay");
		t.add("prince");
		t.add("jiya");
		t.add("pihu");
		System.out.println(t);
    } 
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		
		//return  s1.compareTo(s2);//DNSO
		return -s1.compareTo(s2);//Reverse of DNSO
	}
} 