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

    public boolean isSubsequence(String s, String t) {
        int cursor = 0;
        for (char letter : s.toCharArray()) {
            int idxChar = t.indexOf(letter, cursor);
            if (idxChar < 0){
                return false; // can't find letter
            } else {
                if (idxChar >= cursor){
                    cursor = idxChar; // found letter beyond current cursor
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}