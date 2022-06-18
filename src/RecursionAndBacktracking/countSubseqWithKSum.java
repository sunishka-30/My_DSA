package RecursionAndBacktracking;


import java.util.Scanner;

public class countSubseqWithKSum {
    public static int print(int index, int[] arr,  int sum, int res)
    {
        if(index==arr.length)
        {
            if(res==sum){
                return 1;
            }
            return 0;
        }

        res = res + arr[index];
        int left=print(index+1,arr,sum,res);
        res=res-arr[index];
        int right=print(index+1,arr,sum,res);
        return left+right;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum=sc.nextInt();

        System.out.println(print(0,arr,sum,0));
    }
}
