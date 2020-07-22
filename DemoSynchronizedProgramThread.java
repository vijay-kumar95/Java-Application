package threadprogram1;
class DemoSynchronizedProgramThread
{ 
	public static void main(String[] args)
	{   
		Extension e=new Extension();
        MyThread t1=new MyThread(e,"vijay");
        MyThread t2=new MyThread(e,"Ravi");
        t1.start();
        t2.start();
       
    }
}

 class MyThread extends Thread
 {
     Extension e;
     String name;
     MyThread(Extension e,String name)
     {
     	this.e=e;
     	this.name=name;
     }

 	public void run()
 	{      
 			e.wish(name);
 	}
}
 class Extension
 {
 	public synchronized void wish(String name)
 	{
 		for(int i=0;i<5;i++)
 		{
 		   System.out.println("Good Morning "+":"+name);
 		   try 
 		    {
 			Thread.sleep(1000);
 			
 		    }
 		   catch(InterruptedException e){}
 		}

 	}
 }