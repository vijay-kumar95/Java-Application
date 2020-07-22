
class Pie
{
   public void test()
   {
   	System.out.println("Parent class Tested");
   }
   
}
class Child extends Pie
{
   public void test1()
   {
   	System.out.println("Child class Tested");
   }
}
class SuperChild extends Child
{
	 public void test2()
   {
   	System.out.println(" Super Child class Tested");
   }
   public static void main(String[] args)
   {
    // Pie e=new Pie();
     //Child c=new Child();
     SuperChild sc=new SuperChild();
     sc.test2();
     sc.test1();
     sc.test();
   }
}