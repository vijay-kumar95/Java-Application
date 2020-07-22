interface Printable// example of interface inheritance
{void print();}
interface Showable extends Printable
{
void show();}
class Test22 implements Showable
{
public void print(){System.out.println("hello..");}
public void show(){System.out.println("welcome..");}

public static void main(String[] args)
{
Test22 a=new Test22();
a.print();
a.show();
}
}