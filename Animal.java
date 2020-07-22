/**class Animal//  rxample of static binding
{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal d1=new Animal();  
  d1.eat();  
 }  
}*/


class Animal1  // example of dynamic bindingn 
{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Animal extends Animal1{  
 void eat(){System.out.println("/////dog is eating.../////");}  
  
 public static void main(String args[]){  
  Animal1 a=new Animal();  
  a.eat();  
 }  
}  



  