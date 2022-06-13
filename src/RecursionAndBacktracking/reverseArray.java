package RecursionAndBacktracking;

import java.util.Scanner;

public class reverseArray {
    public static void rev(int i,int[]arr,int n){
        if(i>=n/2)
            return;
        swap(i,n-i-1,arr);
        rev(i+1,arr,n);
    }
    public static void swap(int a,int b,int[]arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        rev( 0, arr, n );
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
