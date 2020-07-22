class ExArray
{
public static void main(String[] args)
{

int arr[]={12,6,8,9,2};

for(int i=0;i<=4;i++)
{
System.out.println(arr[i]);
} 
System.out.println("After Sorting");
for(int i=0;i<=4;i++)
{
for(int j=i+1;j<=4;j++)
{
if(arr[i]>arr[j])
{
int t=arr[i];
    arr[i]=arr[j];
     arr[j]=t;
}
}
}
for(int i=0;i<=4;i++)
{
System.out.print(arr[i]+" ");
}
}
}