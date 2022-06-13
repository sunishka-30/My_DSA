package RecursionAndBacktracking;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int i,String s)
    {
        if(i>=s.length())
          return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        return isPalindrome(i+1,s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = isPalindrome(0,s);
        System.out.println(ans);

    }
}
