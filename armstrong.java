import java.util.*;
class armstrong
{
	public static void main(String[] x)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int num = sc.nextInt();
	int i,j,total = 0,temp,sum = 0;
	
		temp = num;
		while(num > 0)
		{
		//i = num%10;
		total++;
		num = num/10;
		}
	
		num = temp;
		
		while(num > 0)
		{
		j = num%10;
		sum += Math.pow(j,total);
		num = num/10;
		}
		
		if(sum == temp)
		System.out.println(temp +" is an Armstrong Number");
		else
		System.out.println(temp +" is not an Armstrong Number");
	}
}