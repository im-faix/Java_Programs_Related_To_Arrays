package com.jspiders.arrays_dsa;

import java.util.Scanner;

public class MergingArrayZigZag {
    static int[] mergeTwoArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int index = 0;

//        int minLength = Math.min(a.length, b.length);
        
        // Merging elements in a zigzag fashion
//        for (int i = 0; i < minLength; i++) {
//            c[index++] = a[i];
//            c[index++] = b[i];
//        }
//
//        // If a[] has more elements
//        for (int i = minLength; i < a.length; i++) {
//            c[index++] = a[i];
//        }
//
//        // If b[] has more elements
//        for (int i = minLength; i < b.length; i++) {
//            c[index++] = b[i];
//        }
          for(int i=0;i<c.length;i++)
          {
        	  if(i<a.length)
        	  {
        		  c[index] = a[i];
        		  index++;
        	  }
        	  if(i<b.length)
        	  {
        		  c[index] = b[i];
        		  index++;
        	  }
          }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st Array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the 1st Array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the 2nd Array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the 2nd Array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();

        int[] mergedArray = mergeTwoArrays(arr1, arr2);

        System.out.println("Merged array in zigzag fashion:");
        for (int value : mergedArray) {
            System.out.println(value + " ");
            	
        }
//        int maxlength=0;
//        if( arr1.length > arr2.length)
//        	maxlength = arr1.length;
//        else
//        	maxlength = arr2.length;
        	
//        for(int i=0;i<maxlength;i++)
//        {
//        	System.out.println(arr1[i]);
//        	System.out.println(arr2[i]);
//        }
    }
}
