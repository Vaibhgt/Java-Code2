import java.util.Scanner;
class Ifelse1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Please enter your marks");
int marks=sc.nextInt();
if (marks>65)
{
System.out.println("First Division");
}
else
{
System.out.println("Fail");
System.out.println("Please reappear for this exam");
}
}
}