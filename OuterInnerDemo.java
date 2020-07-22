class Outer
{  //Accesing Inner class code in Instance area
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner Class Method");
		}
	}
}	
class OuterInnerDemo
{   
	public static void main(String[] args)
	{
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
	}
}
// {  //Accesing Inner class code in Instance area
// 	class Inner
// 	{
// 		public void m1()
// 		{
// 			System.out.println("Inner Class Method");
// 		}
// 	}
// 	public void m2()
// 	{
// 		System.out.println("Instance Method");
// 		Inner i=new Inner();
// 		i.m1();
// 	}
// 	public static void main(String[] args)
// 	{
// 		OuterInnerDemo o=new OuterInnerDemo();
// 		o.m2();
// 	}
// }
// {  //Accesing Inner class code in static area 
// 	class Inner
// 	{
// 		public void m1()
// 		{
// 			System.out.println("Inner Class Method");
// 		}
// 	}
// 	public static void main(String[] args)
// 	{
// 		OuterInnerDemo o=new OuterInnerDemo();
// 		OuterInnerDemo.Inner i=o.new Inner();
// 		i.m1();
// 	}
// }