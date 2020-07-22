/**class Vechicle// example program without "overriding"
{
void run(){ System.out.println("Vechicle is running "); }
}
 class Bike extends Vechicle
{
public static void main(String[] args)
{
Bike obj=new Bike();
obj.run(); 
}
}*/




class Vechicle // Example program of "overriding"
{
void run(){ System.out.println("Vechicle is running "); }
}
 class Bike extends Vechicle
{
void run(){ System.out.println("Vechicle is running faster as campared to  last one "); }
public static void main(String[] args)
{
Bike obj=new Bike();
obj.run(); 



}


}