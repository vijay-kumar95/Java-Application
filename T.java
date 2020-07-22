import java.util.Scanner;
class T
{  
    static class Nested
    {
        public void m1()
        {
            System.out.println("Nested class method");
        }
    }
    public  static void main(String[] args)
    {
        Nested n=new Nested();
        n.m1();
    }

}

//     public static void main(String[] args) 
//     {

//        Scanner kb=new Scanner(System.in);

//        System.out.println("enter a string1");

//        String s1=kb.nextLine();

//     while(s1.length()>0)    

//     {
//        char c= s1.charAt(0);
//        int n=s1.length()-s1.replace(c+"","").length(); 
//        System.out.println(c+"="+n);
//        s1=s1.replace(c+"", "");    

//      }

//     }

// }

       


// {  //3.patteren
// 	public static void main(String[] args)
// 	{  
//         for(int i=1;i<=9;i++)
//         {
//             if(i<=5)
//             {
//                 for(int j=1;j<5;j++)
//                 {   
//                    if(j>=6-i)
//                    {
//                     System.out.print("*");
//                     }               
//                     else
//                      System.out.print(" ");
//                 }
//                 for(int j=5;j<=9;j++)
//                 {   
//                    if(j<=i+4)
//                     {
//                      System.out.print("*");
//                     }               
//                    else
//                       System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//             else
//             {
//                 for(int j=1;j<5;j++)
//                 {   
//                    if(j>=i-4)
//                    {
//                     System.out.print("*");
//                     }               
//                     else
//                      System.out.print(" ");
//                 }
//                 for(int j=5;j<=9;j++)
//                 {   
//                    if(j<=14-i)
//                     {
//                      System.out.print("*");
//                     }               
//                    else
//                       System.out.print(" ");
//                 }
//                 System.out.println();
//             }
            
//        } 
//    }
// }  
	   // for(int i=1;i<=7;i++)
    //     {
    //         for(int j=1;j<=7;j++)
    //         {   
    //             if(j<=8-i)
    //             {
                    
    //                 System.out.print("# ");
                
                        
    //             }               
                    
    //             else
    //                 System.out.print(" ");
    //         }
    //         System.out.println();
    //         System.out.print("  ");
        
    //     }  