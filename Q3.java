import java.util.*;
class Q3
{
	public static void main(String x[])
	{
		int max = 0,i,pos = 0,size = 10;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter the elements in array");
		for(i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
			for(i=0;i<10;i++)
			{
				if(arr[i] > max)
				{
					max = arr[i];
					pos = i;
				}
			}
			
		
			
		arr[pos] = -100;	
		int max2 = 0;	
			for(i=0;i<10;i++)
			{
				if(arr[i] > max2)
				{
				max2 = arr[i];
				}				
			}
			System.out.println("Second Greatest number is "+max2);
	}
}
