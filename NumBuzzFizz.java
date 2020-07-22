class NumBuzzFizz
{
	public static void main(String[] args)
	{    
		//int num=0;
		//int[] arr=new int[100];
		for(int i=1;i<=100;i++)
		{ 
			if((i%3==0)&&(i%5==0))
				System.out.print("buzzfizz"+" ");
			else if(i%3==0)
				System.out.print("buzz"+" ");
			else if(i%5==0)
				System.out.print("fizz ");
			else
				System.out.print(i+" ");
		}

		
	}
}