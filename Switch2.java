import java.util.Scanner;
class Switch2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter name");
String name=sc.next();

switch (name)
{
case ("Ramji"):
case ("Krishnaji"):
System.out.println("he is a god");
break;
case ("Vaibhav"):
case ("Chinmay"):
System.out.println("he is a man");
break;
default: System.out.println("Invalid Input");
}
}
}
