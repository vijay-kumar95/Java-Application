class ConditionalStatement
{
public static void main(String[] args)
{
int a=100;int b=70; int c=80;
if(a>b){ System.out.println("No Result found");}
else if(a<b){System.out.println("Result matched"); }
else if(a<(c-b)){System.out.println("Result matched 10%"); }
else {System.out.println("Default result"); }

}


}