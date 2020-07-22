class Lcm
{
	public static void main(String[] args)
	{
	  int lcm,a=5,b=3;
	   int gcd=1;
	   for(int i=1;(i<=a&&i<=b);i++)
	   {
		if((a%i==0)&&(b%i==0))
			gcd=i;
	    }
	    lcm=a*b/gcd;
	   System.out.print(lcm+" ");
    }
}