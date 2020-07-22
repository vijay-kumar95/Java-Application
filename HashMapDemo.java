import java.util.*;
class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m=new HashMap();
		m.put("vijay",700);
		m.put("ravi",800);
        m.put("viku",200);
        m.put("dev",500);
        System.out.println(m);//according to HashCode output printed
        System.out.println(m.put("vijay",400));// 700
        Set s=m.keySet();// all key printed
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);// all values printed	
        Set s1=m.entrySet();
        System.out.println(s1);// {vijay 400,ravi 800,viku 200,dev 500}
	    Iterator itr=s1.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry m1=(Map.Entry)itr.next();
	    	System.out.println(m1.getKey()+"...."+m1.getValue());
	    	if(m1.getKey().equals("ravi"))
	    		m1.setValue(10000);
	    }
	    System.out.println(m);

	}

	
}