package RecursionAndBacktracking;

import java.util.Scanner;

public class fibonacci {
    public static int nthFib(int x)
    {
        if(x<=1)
            return x;
        return nthFib(x-1)+nthFib(x-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(nthFib(x));
    }
}
