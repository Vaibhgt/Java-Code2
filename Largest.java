//Largest of 3 number
import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter 3 numbers to compare");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if (a>=b &&a>=c)//Differnce between & and &&
{
System.out.println(a);
}
else if (b>=a && b>=c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
