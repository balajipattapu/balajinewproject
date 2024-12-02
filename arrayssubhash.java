public class arrayssubhash
{
int method1()
{
	int arr[]={4,2,3};
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==2 && arr[i+1]==3)
		{
			arr[i+1]=0;
		}
	}
	return arr;
}
public static void main(String args[])
{
Array$ Set=new Array$();
int result[]=Set.method1();
for(int x:result)
	{
		System.out.println(""+x);
	}
}
]