class typecasting1
{
public static void main(String args[])
{
//upcasting (widening)
int j; //declaration

int i=100; // d eclaration   & initilaze
float f=i;
System.out.println(i);
System.out.println(f);

float f1=200.111111f;
double d=f1;
System.out.println(f1);
System.out.println(d);

//downcasting (Narrowing)
double d3=100.2223445;
float f3= (float) d3;
System.out.println(d3);
System.out.println(f3);
}
}


//   byte -> char -> short -> int -> long -> float -> double
