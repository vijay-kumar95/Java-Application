package myjavatest;
class ModifierCheck
{
	public abstract int add();
}
class TestAbstarct extends ModifierCheck
{

	public int add()
	{
		int a=2,b=4;
		return a+b;
	}
	public static void main(String[] args) 
	{
		TestAbstarct t= new TestAbstarct();
		System.out.println(t.add());
	}
}