class WiproPro
{
	public static void main(String[] args)
	{
		int row=4;
		for(int i=1;i<=row;i++)
		{
            for(int  j=1;j<i;j++)
			{
               System.out.print(i+"*");
			}	
			System.out.println(i);	
		}
        for(int i=row;i>=1;i--)
        {
        	for(int j=1;j<i;j++)
        	{
        		System.out.print(i+"*");
        	} System.out.println(i);
        }


	}
}