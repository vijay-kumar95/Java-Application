import java.util.Scanner;
class AtmProject
{   
  static int choice;
	public static void main(String[] args)
	{   
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Any Vallid Choice: ");
		System.out.println("1 Aadher upadate ");
		System.out.println("2 PAN upadate ");
		System.out.println("3 Moblie Number Chnage ");
		System.out.println("4 PIN Change ");
		System.out.println("5 Mini Statement ");
		System.out.println("6 Cash Withdraw");
		System.out.println("7 Balance Enquairee ");
		System.out.println("8 Fund Transfer");
        choice=scr.nextInt();
     switch(choice)
      {
    	case 1: aadherUpdate();break;
    	case 2: panUpdate();break;
    	case 3: mobileChange();break;
    	case 4: pinChange();break;
    	case 5: miniStatement();break;
    	case 6:
    	case 7:
    	case 8:
    	default :    
      }
    } 
     public static void aadherUpdate() 
     {  
        try
        {


        long aadherno1, aadherno2=0;
     	Scanner scr1=new Scanner(System.in);
     	System.out.println("Enter Your 12 digit aadher no: ");
        aadherno1=scr1.nextInt();
        System.out.println("Confirm Your Aadher no: ");
        aadherno2=scr1.nextInt();
        if(aadherno1==aadherno2)
        	System.out.println("Your Aadher no is updated that is: "+aadherno1);
        else
        	System.out.println("Incorrect Aadher no please provide correct aader no ");
     }
     catch(Exception ex){
        throw ex;
     }
     }
 
     public static void panUpdate()
     {  String panno1, panno2=null;
     	Scanner scr1=new Scanner(System.in);
     	System.out.println("Enter Your PAN card no: ");
        panno1=scr1.nextLine();
        System.out.println("Confirm Your PAN card no: ");
        panno2=scr1.nextLine();
        for(int i=0;i<(panno1.length());i++)
        {
        if((panno1.charAt(i))==(panno2.charAt(i)))
        	System.out.println("Your PAN no is updated that is: "+panno1);
        else
        	System.out.println("Incorrect PAN card no please provide correct PAN card no ");
        }
     }

     public static void mobileChange()
     {  int mono1,mono2,mono3=0;
     	Scanner scr1=new Scanner(System.in);
     	System.out.println("Enter Your old Mobile  no: ");
        mono1=scr1.nextInt();
        System.out.println("Enter your New mobile no : ");
        mono2=scr1.nextInt();
        System.out.println("Confirm your New mobile no : ");
        mono3=scr1.nextInt();
        if(mono2==mono3)
        	System.out.println("Your Mobile no is updated that is: "+mono2);
        else
        	System.out.println("Incorrect Mobile no please provide correct Mobile no ");
     }
     public static void pinChange()
     {  int pin1,pin2=0;
     	Scanner scr1=new Scanner(System.in);
        System.out.println("Enter your New PIN no : ");
        pin1=scr1.nextInt();
        System.out.println("Confirm your New  PIN no : ");
        pin2=scr1.nextInt();
        if(pin1==pin2)
        	System.out.println("Your PIN no is changed that is: "+pin1);
        else
        	System.out.println("PIN no not matched please provide correct correct PIN no: ");
     }
     public static void miniStatement()
      {
      	System.out.println("Your Last five Transaction report : -");
      }



















}