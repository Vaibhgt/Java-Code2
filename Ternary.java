import java.util.Scanner;
class Ternary
{
public static void main(String[] args)
{
int n1=12;
int n2=10;
int max=(n1>n2)?n1:n2;
System.out.println("maximum= "+max);

String s=(n1%2==0)?"Even":"Odd";
System.out.println(s);

boolean b=(n1%2==0)?true:false;
System.out.println("Result= "+b);

System.out.println("Result= "+((n1%2==0)?true:false));
}
}
