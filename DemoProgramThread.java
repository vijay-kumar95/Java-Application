package threadprogram;
class DemoProgramThread
{
  public static void main(String[] args) //throws InterruptedException

   {
     MyThread t=new MyThread();
     t.start();
     t.interrupt();
     //t.join(5000);//main thread going to waithing slot after calling join method
     //Thread.currentThread().setPriority(1);
     //Thread.currentThread().yield();//some of the platform not provide proper suppourt for yield()
       for(int i=0;i<10;i++)
       { 
        System.out.println(i+" main thread tested: ");
         	//Thread.sleep(500);
       }
    }
}

class MyThread extends Thread 
{ 
  public void run()
   {   
        try
   	     {
   	     	System.out.println("i am lazy thread:");
   		 Thread.sleep(10000);  
         }	
   	    catch(InterruptedException e){}
   	    System.out.println("child thread interrupted: ");
   	  
   }
   
} 



/* {
     MyRunnable r=new MyRunnable();
     Thread t=new Thread(r);
     t.start();
    // Thread.currentThread().setPriority(9);
     //Thread.currentThread().setName("anythink");

        Thread.sleep(6000);
        System.out.println("main Thread : "+Thread.currentThread().getName());
        System.out.println("main Thread : "+Thread.currentThread().getPriority());
     	System.out.println("hii world main thread tested");
     
   }
}
 class MyRunnable implements Runnable
 {
 	public void run()
 	{      
 		   Thread.currentThread().setPriority(10);
            Thread.currentThread().setName("shxxxxxx p");
 	        try
 			{Thread.sleep(2000);}
 			catch(InterruptedException e)
 			{}
 			System.out.println("child Thread  : "+Thread.currentThread().getName());
 		     System.out.println("child Thread : "+Thread.currentThread().getPriority());
 			System.out.println("hello world child therad tested");
 	}
 }**/

 /*{
     MyThread t=new MyThread();
     t.start();
     for(int j=0;j<10;j++)
     {  Thread.sleep(1000);
     	System.out.println("main thread tested");
     }
     
	}
}
class MyThread extends Thread 
{ public void run()
   { 

   	for(int i=0;i<10;i++)
   	{try{Thread.sleep(3000);}
     catch(InterruptedException e){}  
   	
   	   System.out.println("child thread tested");
   	}
   }
} **/