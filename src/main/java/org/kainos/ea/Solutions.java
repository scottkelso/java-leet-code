package org.kainos.ea;

public class Solutions {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public boolean isPalindrome(String s) {
        String cleansed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleansed).reverse().toString();
        return cleansed.equals(reversed);
    }
}