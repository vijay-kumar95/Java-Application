class Outer
{
	public void m1()
	{
	  class Inner
	  {
	  	public void sum(int a,int b)
	  	{
         System.out.println("The sum of the number is:"+(a+b));
	  	}
	  }	
	  Inner i=new Inner();
	  i.sum(10,20);
	  i.sum(100,200);
	  i.sum(1000,2000);
	}
}
class MethodLocalInnerClass
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.m1();
	}
}