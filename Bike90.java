/**class Bike90{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike90 obj=new  Bike90();  
 obj.run();  
 }  
}*/       //end of class  



class Bike//final method
{  
final void run(){System.out.println("running");}  
}  
     
class Bike90 extends Bike
{  
void run()
{System.out.println("running safely with 100kmph");}  
public static void main(String args[])
{  
Bike90 honda= new Bike90();  
honda.run();  
}  
}  
