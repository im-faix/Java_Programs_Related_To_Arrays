import java.util.Scanner;

public class FrequencyArray
{
	static void frequencyCount(int arr[])
	{
		boolean b[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(b[i]==false)
			{
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
						b[j]=true;
					} 			
				}
				System.out.println(arr[i] +" "+ (count));
				}
		
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		frequencyCount(arr);
	}
}
