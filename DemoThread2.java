package threadprogram2;
class DemoThread2
{
	public static void main(String[] args) throws InterruptedException
	{
      MyThread t=new MyThread();
      t.start();
      synchronized(t)
      {
      	System.out.println("main thread call wait() method");//1
      	t.wait();
      	System.out.println("main thread got notification");//4
      	System.out.println(t.total);//5
      }
	}
}
class MyThread extends Thread
{  int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child threa Start calculation");//2
			for(int i=0;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child thread giving notification ");//3
			this.notify();

		}
	}

}