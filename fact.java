//Program to find out factorial of any number
import java.util.Scanner;
class fact
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number to calculate factorial");
	int fact=sc.nextInt();
	int res=1;
	for (int i=1;i<=fact;i++)
	{
		
		res=res*i;
	}
	System.out.println(res);
}
}
	
