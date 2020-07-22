import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		/*t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");**/
	    t.add(null);//NPE
		//t.add(new Integer(10));//RE CCE

		System.out.println(t);//[]
	}
}