
import java.util.Scanner;
 class A
{   
	private int age;
	private String name;
	public void ageSet(int a)
	{
		age=a;
	}
	public void personName(String n)
	{
		name=n;
	}
	public int m1()
	{
		return age;
	}
	public String m2()
	{
		return name;
	}

}

public class EncapsulationDemo
{   
   public static void main(String[] args) 
   {
   	A aref=new A();
   	aref.ageSet(18);
   	aref.personName("sanju");
   	System.out.println(aref.m1());
   	System.out.println(aref.m2());

   }
}