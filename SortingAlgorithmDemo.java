class SortingAlogorithmDemo
{
	public static void main(String[] args)
	{  //Bubble sort  
		int temp=0;
		int[] arr={23,19,43,9,89};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len-i;j++)
			{
				if(arr[i]>arr[j])
					{
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;

					}
			}
		}

		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}