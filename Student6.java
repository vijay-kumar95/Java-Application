class Student6  //example  of static method
{
int roll;
String name;
static String college="TIT";

static void change()
{
 college="GOSSNER";
}
Student6(int r,String n)
{
 roll=r;name=n;
}

void display(){System.out.println(roll+" "+name+" "+college);}

public static void main(String[] args )
{
Student6.change();

Student6 o1=new Student6(108,"rock");
Student6 o2=new Student6(107,"rolly");
Student6 o3=new Student6(106,"emma");
o1.display();
o2.display();
o3.display();

}


}