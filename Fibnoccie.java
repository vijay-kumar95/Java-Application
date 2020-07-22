class Fibnoccie 
{
	public static void main(String[] args)
	{
      int a=0,b=1,c=0;
      System.out.print(a+" ");
      System.out.print(b+" ");
      c=a+b;
      System.out.print(c+" ");
      for(int i=0;i<=6;i++)
      {
      	a=b;
      b=c;
      c=a+b;
      System.out.print(c+" ");
      }
 
       
     
	}
}