class Student4// constructor overloading program example
{
int id;
String name;
int age;
Student4(int i,String n){id =i;name=n;}
Student4(int i,String n,int a){id=i; name=n;age=a;}
void display(){System.out.println(id+" "+name+" "+age );}
public static void main(String[] args)
{
Student4 S1=new Student4(111,"vijay verma");
Student4 S2=new Student4(222,"jay verma",10);
S1.display();
S2.display();

} 


}