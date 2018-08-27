class ABC
{
	static
	{
	System.out.println("Static function of ABC class called ");
	}
}

class Q4
{
	public static void main(String x[])
	{
	System.out.println("Main function called ");
	ABC obj = new ABC();
	}
}