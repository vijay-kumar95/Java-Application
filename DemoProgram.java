class DemoProgram
{
 public static void main(String[] args) throws InterruptedException
 {
    MyThread t=new MyThread();
    t.start();
    synchronized(t)
    {
    	System.out.println("1");
    	 t.wait();
    	System.out.println("main thread got notification 3");

    }
 }	
}
class MyThread extends Thread
{
    public void run()
    {
    	synchronized(this)
    	{
           System.out.println("2");
           this.notify();
    	}
    }
}