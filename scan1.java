import java.util.Scanner;
class scan1
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);//Decleration of Scanner class of object
System.out.println("Please enter an integer number");//Message
int n1=sc.nextInt();//Getting the input from user
System.out.println("Please enter another integer number");
int n2=sc.nextInt();
int k=(n1+n2);
System.out.println("sum= "+k);
}
}
