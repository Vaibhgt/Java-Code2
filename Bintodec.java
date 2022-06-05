//Program to convert binary number to decimal number
class Bintodec
{
	public static void main(String args[])
	{
		int n=17;
		String bin="";
		while(n>0)
		{
			int r=n%2;
			bin=bin+r;
			n=n/2;
		}
		System.out.println(bin);
	}
}