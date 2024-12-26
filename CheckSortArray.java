package com.jspiders.arrays_dsa;

import java.util.Scanner;

public class CheckSortArray
{
	static boolean sortArray(int[] a)
	{
		for(int i=1;i<=a.length-2;i++)
		{
			if(a[i] >a[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		if(sortArray(arr))
		{
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}
}
