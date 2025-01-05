import java.util.Scanner;

public class LinearSearch 
{
	static int linearSearch(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(n == a[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the  Array");
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		System.out.println("Enter  "+n1 + " Elements for the  Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to Serch");
		int find = sc.nextInt();
		sc.close();
		int a = linearSearch(arr, find);
		if(a == -1)
			System.out.println("Element Not Found");
		else
			System.out.println("The " +find  + " Element is Present at Position " + a);
//		System.out.println(Arrays.toString(arr));
	}
}
