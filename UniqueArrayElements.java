package com.jspiders.arrays_dsa;

import java.util.Scanner;

public class UniqueArrayElements 
{
	static boolean uniqueElements(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{ 
				if (a[i] == a[j]) 
				{ 
					return false; // Found a duplicate element
				}
			}
		}
	return true;
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		if(uniqueElements(arr))
		{
			System.out.println("The Array is Unique");
		}
		else
		{
			System.out.println("The Array is not Unique");
		}
		
			
		
	}
}
