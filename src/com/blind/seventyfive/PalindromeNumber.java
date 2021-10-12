package com.blind.seventyfive;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        while( x / 10 > reversed ) {
//            System.out.println(reversed + " * 10 + " + x % 10);
            reversed = reversed * 10 + (x % 10);
//            System.out.println("reversed = " + reversed );
            x /= 10;
//            System.out.println("x = " + x);
//            System.out.println("------------------------------");
        }
        return x == reversed || x == reversed/10;
    }

//    public static void main(String[] args) {
//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(12221));
//        System.out.println(isPalindrome(Integer.MAX_VALUE));
//    }
}
