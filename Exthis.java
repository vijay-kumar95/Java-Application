class N  //without using this keyword getting same result as in case of using this keyword
{ 
int roll;
String name;
float fee;
N(int r,String n,float f)
{ 
roll=r;
name=n;
fee=f;
}
void display(){ System.out.println(roll+" "+name+" "+fee);}

}


class Exthis
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