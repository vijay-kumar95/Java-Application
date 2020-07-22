/**class Van // Example of java runtime polymorphism
{
void run(){System.out.println("speed is limit");}
}

class Maruti extends Van
{
void run(){System.out.println("Maruti Speed limit Up to 60kmph");}
public static void main(String[] args)
{
Van b=new Maruti();//Upcasting:reference variable of parent class is used to refer the object of the child class
b.run();
}

}*/



class Animal
{
void eat(){System.out.println(" animal is eating");}
}

class Dog extends Animal
{
void eat(){System.out.println("dog is eating");}
}

class Maruti extends Dog
{
public static void main(String[] args)
{Dog d=new Maruti();       // Upcasting  
 d.eat();

}
}