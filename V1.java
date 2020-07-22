interface Name
{
	abstract int add(int p,int q);// by default all interface method public,abstract,static
	abstract void normal();
	
}
class V1 implements Name
{   
	public static void main(String[] args)
	{
		V1 v=new V1();
		System.out.println(v.add(3,1));
		v.normal();
	}
	public void normal()
	{
      System.out.println("hiii");
	}
	public int add(int p,int q)
	{
     if(p>q)
     return p-q;
     else
     return q-p; 
	}//
}
