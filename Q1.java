class Rectangle
{
	double length,breadth,area;
	
	void setdata(int x,int y)
	{
	length = x;
	breadth = y;
	}
	
	void getdata()
	{
	area = length*breadth;
	System.out.println("Area of Rectangle is "+area);
	}
}

class Q1
{
	public static void main(String[] x)
	{
	Rectangle obj = new Rectangle();
	obj.setdata(2,3);
	obj.getdata();
	}
}