class Gcd
{
	public static void main(String[] args)
	{
	  int a=5,b=25;
	   int gcd=1;
	   for(int i=1;(i<=a&&i<=b);i++)
	   {
		if((a%i==0)&&(b%i==0))
			gcd=i;
	    }
	   System.out.print(gcd+" ");
    }
}