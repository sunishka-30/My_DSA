package RecursionAndBacktracking;

import java.util.Scanner;

public class printName {
    public static void print(String name,int i,int n)
    {

        if(i>n)
            return;
        System.out.println(name);
        print(name,i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        int n = sc.nextInt();
        print(name,1,n);
    }
}
