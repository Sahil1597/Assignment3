import java.util.*;
class reverse
{
	public static void main(String[] x)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");	
	int num = sc.nextInt();
	int i,rev= 0,temp;
	temp = num;
		while(num > 0)
		{
		i = num%10;
		rev = rev*10 + i;
		num = num/10;
		}
		
		System.out.println("Reverse of "+temp+" is "+rev );
	
	}
}