class Ar1
{
	public static void main(String[] args)
	{
       String s="new word reverse even";
       String[] str=s.split(" ");

       int len=str.length;
       for(int i=0;i<len;i++)
       {
       	if(i%2!=0)
        // char[] ch=s.toCharArray();
       	System.out.print(charAt(i)+" ");
       
       }
	}
}