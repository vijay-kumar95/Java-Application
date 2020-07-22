package myjavatest;
interface A
{
void m1();
}
interface B
{
void m2();
}

interface C extends A,B
{
void m3();
}

class P implements C
{

   public  void m1() {System.out.println("hi");}
   public  void m2() {System.out.println("hello");}
   public  void m3() {System.out.println("hey");}
	
	public static void main(String[] args)
	{
		C b=new P();
		b.m1();
		b.m2();
		b.m3();
    }
  
}
