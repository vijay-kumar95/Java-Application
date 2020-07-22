import java.lang.reflect.*;
class Student
{
	public String getName()
	{
		return null;
	}
	public int getMarks()
	{
		return 80;
	}

}
class JvmTest
{
	public static void main(String[] args) throws Exception
	{   int count=0;
		// Class c=Class.forName("java.lang.Object");
		Class c=Class.forName("Student");
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println(m1);

		} System.out.println("Number of method in that class is "+count);
	}
}