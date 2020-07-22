class DemoConstructor
{   
	public static void main(String[] args)
	{
		//Student st=new Student("My Constructor program test");
	   Teacher t=new Teacher();
	   System.out.println(t.add(12,22));
		//Student st= new Student();

	}
}

class Student
{
	Student(String s)
	{
		System.out.println(s);
	}	
}
class Teacher
{  

	Teacher()
	{

	}
	Teacher(String s,int age,int c)
	{
		System.out.println(s);
		System.out.println(age);
		System.out.println(c);
	}	


	 public int add(int a,int b)
	 {  
	   int sum=0;
	   sum=a+b;
	   return sum;
	 }
}