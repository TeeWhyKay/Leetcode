package com.blind.seventyfive;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // if they are not the same length, clearly both are not anagrams of each other
        if(s.length() != t.length()) return false;
        // counter based on ascii value
        int[] charCounter = new int[26];
        // for every character encountered, add 1
        for(char c:s.toCharArray()) {
            charCounter[(int) c - 'a']+=1;
        }
        // for every character encountered, minus 1 or if char does not exist, clearly not an anagram
        for(char c:t.toCharArray()) {
            if (charCounter[(int) c - 'a']-- == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("fish", "hisf"));
        System.out.println(isAnagram("fisher", "hisfe"));

    }
}
