//Addition of two numbers
import java.util.Scanner;
class first
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter 2 number for addition");
float x= sc.nextFloat();
float y =sc.nextFloat();
float z=x+y;
//if we will take integer data type it will not take decimal number
System.out.println("Sum="+z);
}
}
