import java.util.Scanner;
class Employee
{
	int a=102;
	static int id=101;
	
	void display()
	{
		System.out.println(a);
		System.out.println(id);
	}
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.display();
		e2.id=23;
		e1.display();
		e2.display();
	
	}
}
	