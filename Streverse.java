class Streverse
{
public static void main(String[] args)
{String str="my first prograM";
int len=str.length();

String s1="";
for(int i=len-1;i>=0;i--)
{s1=s1+str.charAt(i);
}
System.out.println(s1);
}
}