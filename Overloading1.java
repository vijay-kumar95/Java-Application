/**class Adder//(1)overloading by changing no of arguments
{
static int add(int a,int b) 
{return a+b;}
static int add(int a,int b,int c)
{return a+b+c;}
}
 class Overloading1
{
public static void main(String[] args)
{
System.out.println(Adder.add(11,11));
System.out.println(Adder.add(11,11,11));
}
}*/





class Adder {//(2)overloading by changing datatypes of arguments
static int add(int a,int b) 
{return a+b;}
static double add(double a,double b)
{return a+b;}
}
 class Overloading1
{
public static void main(String[] args)
{
System.out.println(Adder.add(11,11));
System.out.println(Adder.add(10.75,11.25));
}
}