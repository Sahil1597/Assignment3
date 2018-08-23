import java.util.*;
class search
{
	public static void main(String[] x)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number you want to search ");
	int n = sc.nextInt();
		int arr[] = {1,4,6,7,8,9,10};
			
		int i,j,flag = 0;
		
		for(i=0;i<7;i++)
		{
			 flag = 0;
			if(n == arr[i])
			{
			flag = 1;	
			break;
			}		
		}
		if(flag == 1)
		System.out.println("Number is found ");
		else
		System.out.println("Number not found ");	
				
	}
}