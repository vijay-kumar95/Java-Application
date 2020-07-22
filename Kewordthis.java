class N// example of use of "this" keyword to reffer current class instance variable
{
int roll;
String name;
float fee;
N(int roll,String name,float fee)
{ 
this.roll=roll;
this.name=name;
this.fee=fee;
}
void display(){ System.out.println(roll+" "+name+" "+fee);}

}


class Keywordthis
{
public static void main(String[] args)
{
N s1=new N(109,"vikku",6500.5f);
N s2=new N(108,"vijay",6400.5f);
N s3=new N(107,"vipul",6300.5f);
s1.display();
s2.display();
s3.display();
}
}