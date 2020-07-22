/**class Animal// single level inheritence
{
void sought(){ System.out.println("barking....");}
void weep(){System.out.println("weeping....");}
}
class Dogs extends Animal
{
public static void main(String[] args)
{
Dogs d=new Dogs();
Dogs c= new Dogs();
d.sought();
c.weep();
}


}*/


class Animal// multi level inheritence
{
void sought(){ System.out.println("barking....");}
}

class Cat extends Animal
{
void sound1(){System.out.println("meow....");}
}

class Dogs extends Cat
{
public static void main(String[] args)
{
Dogs d=new Dogs();
Dogs c= new Dogs();
d.sought();
c.sound1();
}

}





