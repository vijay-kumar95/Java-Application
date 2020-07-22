class PatternHash
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{for(int j=1;j<=7;j++)
if(i==1)
System.out.print("#");
else if(i==2&&(j==2||j<=6))
System.out.println("#");
else if(i==3&&(j==3||j<=5))
System.out.println("#");
else if(i==4&&j==4)
System.out.println("#");
else
System.out.println(" ");
}
}

}