class SelectionSortDemo
{
    public static void main(String[] args)
	{  //String value sorting
		String[] a={"vipul","atul","sujoy","babita","yogesh"};
		String temp;
		for(int i=0;i<a.length;i++)
		{  
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min].compareTo(a[j])>0)
					min=j;
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;

		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}	
// 	public static void main(String[] args)
// 	{  //Integer value sorting
// 		int[] a={23,8,54,67,5,2,90};//6
// 		int temp=0;
// 		for(int i=0;i<a.length;i++)
// 		{  
// 			int min=i;
// 			for(int j=i+1;j<a.length;j++)
// 			{
// 				if(a[min]>a[j])
// 					min=j;
// 			}
// 			temp=a[min];
// 			a[min]=a[i];
// 			a[i]=temp;

// 		}
// 		for(int i=0;i<a.length;i++)
// 		{
// 			System.out.print(a[i]+" ");
// 		}
// 	}
// }