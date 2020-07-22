class MyThread extends Thread
{
	static Thread r;
  public void run() 
  {
  	try
  	{
    r.join(10000);}
    catch(InterruptedException e){}
    for(int i=0;i<10;i++)
    {
    System.out.println("child thread");
    }
  }
}
class ThreadJoinCase2
{
	public static void main(String[] args) throws InterruptedException
	{
       MyThread.r=Thread.currentThread();
       MyThread t=new MyThread();
       t.start();
       for(int i=0;i<10;i++)
       {
       	System.out.println("main thread");
       	Thread.sleep(2000);	
       
       }

	}
}