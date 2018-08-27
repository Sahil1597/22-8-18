class Complex
{
	float a,b;
	
	void setdata(int x,int y)
	{
	a = x;
	b = y;
	}
	
	void getdata()
	{
	System.out.println("Sum is "+a +" + "+b +"i");
	}
}

class Q2
{
	public static void main(String[] x)
	{
	Complex obj = new Complex();
	obj.setdata(2,3);
	obj.getdata();
	}
}