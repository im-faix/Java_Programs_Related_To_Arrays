import java.util.Scanner;

public class MergeingTwoArray
{
	static int[]  mergeTwoArray(int a[],int b[])
	{
		int arr[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
//			arr[i]=b[i];
			arr[a.length+i]=b[i];
		}
		return arr;
	}
	public static  void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the 1st  Array");
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		System.out.println("Enter  "+n1 + " Elements for the 1st Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd Array");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter "+n2 + " Elements for the 2nd Array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		sc.close();
		 int a[]=mergeTwoArray(arr, arr2);
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		
	}
}
