package com.practiseProblems;

/**
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.[1]
 * For example, the word anagram can be rearranged into nag a ram,
 * or the word binary into brainy or the word adobe into abode.
 */
class Anagrams {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[1 << 8];  // 10000000 (binary representation) = 256 (decimal numbering system)

        for (char c : s1.toCharArray()) {
            letters[c]++;
        }

        for (char c : s2.toCharArray()) {
            letters[c]--;
        }

        for (int i : letters) {
            if (i != 0) return false;
        }

        return true;
    }
}