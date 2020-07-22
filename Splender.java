/**class Motor
{
  void bike(){System.out.println("running");}}

class Splender extends Motor
{
public static void main(String[] args)
{
Splender obj=new Splender();
obj.bike();
}

}*/



//Example program of abstract class & abstract method    

/**abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
}  
} */


abstract class Shape
{  
abstract void draw();  
}   

class Rectangle extends Shape
{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape
{  
void draw(){System.out.println("drawing circle");}  
}

class TestAbstraction1
{  
public static void main(String args[])
{  
Shape s=new Circle1(); 
s.draw();  
}  
}  



 

















 