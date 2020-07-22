package synchronizationdemo;
class DemoProgramSynchronization
{
	public static void main(String[] args) throws InterruptedException
	{
	  NameCollege n = new NameCollege();
      MyThread t1=new MyThread(n,"vijay");
      MyThread t2=new MyThread(n,"jay");
      t1.run();
      t2.run();
      for(int i=1;i<=10;i++)
      { 
      	System.out.println(i+" main thread tested");
      	Thread.sleep(1000);
      }
	}
}
class MyThread extends Thread
{   NameCollege n;
	String s;
	
	MyThread(NameCollege n,String s)
	{
		this.n=n;
		this.s=s;
	}

	public  void run()
	{
      n.information(s);
	}
}
 class NameCollege
 {
    public synchronized void information(String s)
    {   
     
       for(int i=0;i<10;i++){
       	  System.out.println("good evening :" +s);
       	try{Thread.sleep(1000);}
       	catch(InterruptedException e){}
       }
       
       
    }
 }