class MultiOpertors//
{
public static void main(String[] args)
{
int a=10;int b=15; int c=20;
System.out.println(a+b);//25
System.out.println(a-b);//-5
System.out.println(a*b);//150
System.out.println(a/b);//0
System.out.println(a%b);//10
System.out.println(a++ + c++);//10+21=31
System.out.println(a++ + ++b);//10+16=26
System.out.println(a++ * ++b);//10*16=160
System.out.println(a>b && c>b);// F&&T=F
System.out.println(a<b ||b<c);//T||T=T
System.out.println(a>b||b<c);  //F||T=T

}

}