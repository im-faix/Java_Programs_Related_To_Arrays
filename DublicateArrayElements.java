import java.util.Scanner;

public class DublicateArrayElements
{
	static void frequencyElement(int arr[])
	{
		int dub=0;
		boolean b[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(b[i]==false)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						dub++;
						b[j]=true;
					} 
				}
				if(dub>1)//for Dublicating Elements 
					System.out.println(arr[i] );
//				lr++;
				dub=0;
			}		
		}	
	}
	public static void main(String[] args) {
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
		frequencyElement(arr);
	}
}
