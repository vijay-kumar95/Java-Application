class ArrPro
{
	public static void main(String[] args)
    {
    	int[] arr={1,2,3,4,5};
    	ArrPro t= new ArrPro();
    	//boolean num= 
    	t.check(arr);
    	//System.out.println(num);
    }
        boolean check(int[] arr)
        {
         int a=0,b=0,c=0,d=0;
        	for(int i=0;i<5;i++)
            {   
            	d=(i+1)+1; 
            	a=arr[i];
            	b=arr[i+1];
            	c=arr[d];
                 if(((a*a)+(b*b))==(c*c))
                 {	
                 	return true;
                 	//System.out.print(" "+i);
                 }
                 else 
                 {
                 	return false;
                 	//System.out.print(" "+i);

                 }	
            }
            
        }
    
}