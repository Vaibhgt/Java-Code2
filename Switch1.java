import java.util.Scanner;
class Switch1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a vowel");
char vowel=sc.next().charAt(1);

switch(vowel)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("Vowel in lower case");
break;
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("Vowel in uppper case");
break;
default: System.out.println("not a vowel!!!");
}
System.out.println("Cdac Mumbai");
}
}
