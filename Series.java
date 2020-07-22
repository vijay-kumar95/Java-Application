class Series
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
						System.out.print(a);

						System.out.print(" "+b);

		c=a+b;
		System.out.print(" "+c);
		for(int i=0;i<30;i++)
		{
              a=b;
			b=c;
			c=a+b;
		System.out.print(" "+c);
		

		}

	}
}