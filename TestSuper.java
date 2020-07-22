/**class Animal
{
String colour="brown";
}
class Dog extends Animal
{
String colour="Black";
void printcolour()
{ System.out.println(super.colour); // printing here colour from animal class by using Super keyword
System.out.println(colour);
}

}
class TestSuper
{
public static void  main(String[] args)
{
Dog s1=new Dog();
s1.printcolour();

}


}*/


/**class Animal
{
void eat(){System.out.println("eating");}
}
class Dog extends Animal
{
void bark()
{ System.out.println("barking");//super can be used for parent class method
super.eat();
 

}

}
class TestSuper
{
public static void  main(String[] args)
{
Dog s2=new Dog();
s2.bark();

}

}*/


class Animal// super keyword used for parent class constructor
{  
Animal()
{System.out.println("animal is created");}  
} 
 
class Dog extends Animal
{  
Dog()
{  
super();  
System.out.println("dog is created");  
}  
}  

class TestSuper
{  
public static void main(String args[])
{  
Dog d=new Dog();  
}
}  


