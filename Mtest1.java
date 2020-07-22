class Mtest1
{  
	public static void main(String[] args)
	{
	int a=3,b=0,count=0;
	for(int i=1;i<=10;i++)
	{
		b=a*i;
		if((b%3)!=0)
        count=count+1;
	} System.out.print(count);
      }
}