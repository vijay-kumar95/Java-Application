import java.util.*;
class ComparableComparatorDemo
{
	public static void main(String[] args)
	{
	    
	    Employees e1=new Employees("vijay",100);
	    Employees e2=new Employees("dev",200);
	    Employees e3=new Employees("ravi",50);
        Employees e4=new Employees("urvashi",150);
        Employees e5=new Employees("sharddha",100);
        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);//DNSO according to eid  i,e[ravi...50,vijay...100,urvashi...150,dev...200]
        TreeSet t1=new TreeSet(new MyComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);//DNSO according to alphabetical order  i,e[dev...200,ravi...50,urvashi...150,vijay...100]

    }
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employees e1=(Employees)obj1;
		Employees e2=(Employees)obj2;
		String s1=e1.name;
		String s2= e2.name;
		return s1.compareTo(s2);
	}
}
class Employees implements Comparable
{
	String name;
	int eid;
	Employees(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"..."+eid;
	}

	public int CompareTo(Object obj)
	{
		int eid1=this.eid;
		Employees e=(Employees)obj;
		int eid2=e.eid;
		if(eid<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else
			return 0;

	}
}
