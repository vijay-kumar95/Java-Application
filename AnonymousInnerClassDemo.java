class PopCon
{
	public void taste()
	{
		System.out.println("Salty");
	}
}
class AnonymousInnerClassDemo
{
	public static void main(String[] args)
	{
      PopCon p1=new PopCon()
      {
      	public void taste()
      	{
      		System.out.println("Sweet");
      	}
      };
      p1.taste();//Sweet
      PopCon p=new PopCon();
      p.taste();//salty
      PopCon p2=new PopCon()
      {
      	public void taste()
      	{
      		System.out.println("Spicy");
      	}
      };
      p2.taste();//spicy
      System.out.println(p1.getClass().getName());//AnonymousInnerClassDemo$1
      System.out.println(p.getClass().getName());//PopCon
      System.out.println(p2.getClass().getName());//AnonymousInnerClassDemo$2
	}
}