import java.util.Scanner;

public class SortedOrNot 
{
    static boolean isSortedAsc(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i + 1]) {
                return false; // Not sorted in ascending order
            }
        }
        return true; // Sorted in ascending order
    }

    static boolean isSortedDesc(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // Not sorted in descending order
            }
        }
        return true; // Sorted in descending order
    }

    static boolean sortingAscDesc(int[] a) {
        return isSortedAsc(a) || isSortedDesc(a);
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array:");
        for (int i = 0; i < arr.length; i++)
         {
            arr[i] = sc.nextInt();
        }
        sc.close();

        if (sortingAscDesc(arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
