import java.util.*;
class SetProgramDemo
{
	public static void main(String[] args)
	{
     //HashSet h=new HashSet();
		//LinkedHashSet h=new LinkedHashSet();
	 TreeSet h=new TreeSet(new MyComparator());//c a Z B
	  h.add('a');//97
      h.add('B');//66
     h.add('c');//99
     h.add('Z');//86
     System.out.println(h);//DNSO B Z a c
    }
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{   
		return -obj1.compareTo(obj2);
	}
}