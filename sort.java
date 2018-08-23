import java.util.*;
class sort
{
	public static void main(String[] x)
	{
		int arr[] = {1,1,1,1,0,0,1,0};
			
		int i,j,temp;
		
		for(i=0;i<8;i++)
		{
			for(j=i+1;j<8;j++)
			{
				if(arr[i] > arr[j])
				{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting ");
		for(int t:arr)
		System.out.println(t);	
		
		
	}
}