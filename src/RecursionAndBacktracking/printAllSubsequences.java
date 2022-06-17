package RecursionAndBacktracking;

import java.util.ArrayList;

import java.util.Scanner;

public class printAllSubsequences {
    public static void print(int index,ArrayList<Integer>l,int[] arr,int n)
    {
        if(index==n) {

            for(int i:l)
                System.out.print(i+" ");
            if(l.size()==0)
                System.out.print("{}");
            System.out.println();
            return;

        }
        l.add(arr[index]);
            print(index + 1, l, arr, n);

        l.remove(l.size() - 1);
            print(index + 1, l, arr, n);



    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        print(0,l,arr,n);


    }
}
