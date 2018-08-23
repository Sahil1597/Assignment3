import java.util.*;
class even
{
	public static void main(String[] x)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value ");
	
	int n = sc.nextInt();
	System.out.println("Even numbers from 1 to "+n +" are ");
	int i;
	
		for(i=1;i<=n;i++)
		{
			if(i%2 == 0)
			System.out.println(i);
		}
	
	}
}
