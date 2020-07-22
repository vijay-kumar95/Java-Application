class BubbleSortDemo
{ // for String
	public static void main(String[] args)
	{
		String[] arr={"vipul","atul","sujoy","babita","yogesh"};
		int len=arr.length;
		String temp;
		for(int i=0;i<len;i++)
		{	//Desending order
			for(int j=0;j<len-1-i;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
                     temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
// { // for integer value
// 	public static void main(String[] args)
// 	{
// 		int[] arr={3,7,9,12,1};
// 		int len=arr.length;
// 		int temp=0;
// 		for(int i=0;i<len;i++)
// 		{	//Desending order
// 			for(int j=0;j<len-1-i;j++)
// 			{
// 				if(arr[j]<arr[j+1])
// 				{
//                      temp=arr[j+1];
//                      arr[j+1]=arr[j];
//                      arr[j]=temp;
// 				}
// 			}
// 		}
// 		for(int i=0;i<len;i++)
// 		{
// 			System.out.print(arr[i]+" ");
// 		}
// 	}
// }     // Asending order
			// for(int j=0;j<len-1-i;j++)
			// {
			// 	if(arr[j]>arr[j+1])
			// 	{
   //                   temp=arr[j+1];
   //                   arr[j+1]=arr[j];
   //                   arr[j]=temp;
			// 	}
			// }
		//}
		