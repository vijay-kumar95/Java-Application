import java.util.*;
class ListIteratorDemo
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("Rose");
		l.add("joshephine");
		l.add("Wing");
		l.add("cherry");
		System.out.println(l);//[Rose,joshephine,wing,cherry]
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("joshephine"))
			{
				ltr.remove();//[Rose,wing,cherry]
			}
			else if(s.equals("cherry"))
			{
				ltr.add("love");//[Rose,wing,cherry,love]
			}
			else if(s.equals("Wing"))
			{
				ltr.set("jin");//[Rose,jin,cherry,love]
			}

		}
		System.out.println(l);//[Rose,jin,cherry,love]
	}
}