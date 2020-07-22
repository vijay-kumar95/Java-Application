import java.util.*;
class StackDemo
{
	public static void main(String[] args)
	{
	  Stack s=new Stack();
	  s.push("Wing");
	  s.push("Rose");
	  s.push("Josephine");
	  System.out.println(s);//[wing,Rose,josephine]
	  System.out.println(s.search("Wing"));//3
	  System.out.println(s.search("jin"));//-1


	}
}