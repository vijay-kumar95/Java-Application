
//example of interface

/**interface printable
{
void pk();}

class A6 implements printable
{
public void pk(){System.out.println("printing...");}
public static void main(String[] args)
{A6 a=new A6();
a.pk();
}
}*/



interface Bank{  //example of interface 
float rateOfInterest();  
} 
 
class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  
}  

class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  

class TestInterface2{  
public static void main(String[] args){  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}}  

