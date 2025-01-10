package com.jspiders.arrays_dsa;

import java.util.*;
//import java.util.Scanner;

public class ReverseArray 
{
	static int[] rverseA(int[] arr)
	{
		int l=0;
		int h=arr.length-1;
				
		while(l<h)
		{
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
//		int max=0;
//		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		
		arr= rverseA(arr);
		System.out.println(Arrays.toString(arr));
}
}
