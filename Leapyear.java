//Program to check leap year
import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a year");
int year=sc.nextInt();
if ((year%400==0)||(year%4==0)&&(year%100!=0))
{
System.out.println("This year is a Leapyear");
}
else
{
System.out.println("This year is not a leap year");
}
}
}

