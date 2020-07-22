import java.util.*;
class ListCurserDemo
{
	public static void main(String[] args)
	{
    // ArrayList l=new ArrayList();
	 // Vector v=new Vector();
		LinkedList l=new LinkedList();
     for(int i=1;i<=10;i++)
     {
     	l.add(i);
     }
     l.addFirst(null);
     l.addLast(12.34);
     /*l.add(1);
     l.add('a');
     l.add(null);
     l.add(1.23);
     l.add('a');
     l.add('A');**/
    // System.out.println(l);
     Iterator itr=l.iterator();
    // Enumeration e=v.elements();
     while(itr.hasNext())
     {
     //	Integer intr=(Integer)itr.next();
     	System.out.print(itr.next()+" ");
     }

	}
}