class Q5
{
	public static void main(String[] x)
	{
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int i;
	
		System.out.print("Original array is ");
		{
			for(int y:arr)
			System.out.print(y+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Array in Waveform is ");
		
		for(i=0;i<10;i=i+2)
		{
			if(arr[i] < arr[i+1])
			{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
		}
		for(int n:arr)
		{
		System.out.print(n+" ");
		}
		
	}
}