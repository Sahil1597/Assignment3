import java.util.*;
class prime
{
	public static void main(String[] x)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number ");	
	int num = sc.nextInt();
	
	System.out.println("Prime numbers from 1 to "+num+" are ");
	
	int i,count,j;
	
		for(i=1;i<=num;i++)
		{
			count = 0;
			for(j=1;j<=i;j++)
			{
				if(i%j == 0)
				count++;
			}
			if(count == 2)
			System.out.println(i);
		}	
	
	}
}