package myjavatest;
interface Check
{ 
	int x=10;
    void testMethod();
    void add();
}
	
class IntProTest implements Check
{
	private int p=0;
	public static void main(String[] args)
	{
		IntProTest i=new IntProTest();
		i.testMethod();
		i.add();
		
	}

	public void testMethod()
	{  
		System.out.println("Hi Interface program testsed:  "+x);
    }

    public void add()
     {
     p=x+1;
     System.out.println(p);
     }
}