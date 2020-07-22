import java.util.*;
class LinkedListDemo
{
  public static void main(String[] args)
  {
	LinkedList l= new LinkedList();
	l.add("durga");
	l.add(30);
	l.add(null);
	l.add("durga");
	System.out.println(l);//[durga,30,null,durga]
	l.set(0,"Software");//[Software,30,null,durga]
	l.add(0,"venky");//[venky,Software,30,null,durga]
	l.removeLast();//[venky,Software,30,null]
	l.addFirst("ccc");//[ccc,venky,Software,30,null]
	System.out.println(l);//[ccc,venky,Software,30,null]
  }
}
