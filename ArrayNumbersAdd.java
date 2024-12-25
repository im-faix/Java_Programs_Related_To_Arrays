

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumbersAdd 
{
	static int addNumber(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rev = n%10;
			sum += rev;
			n = n/10;
			
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of the Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=addNumber(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
