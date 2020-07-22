package myjavatest;
interface A
{
void m1();
}
interface B
{
void m2();
}
class Z implements A,B
{
	public void m1()
	{
       System.out.println("hiiii");
	}
	public void m2()
	{
       System.out.println("helllo");
	}
}
class Y extends Z
{
	public static void main(String[] args)
	{
		B z1=new Z();
		//z1.m1();
		z1.m2();
	}
}