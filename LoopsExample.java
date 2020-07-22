class LoopsExample
{
public static void main(String[] args)
{
for(int i=1;i<=3;i++) // simple for loop
{
System.out.println("Simple lopp program checked");
}
   aa:// labeled for loop
    for(int i=1;i<=3;i++)
     { 
      bb:
         for(int j=1;j<=3;j++) 
         { if (i==2&&j==2)
           {break aa;}
          System.out.println(i+" "+j);  //"+" represent concation
         }
      }
 /*for(;;) //infintive loop
    {  System.out.println("infinitive loop test ");}*/
}

}//here infinte loop program is also after it is run need to stop program by command ctrl+c