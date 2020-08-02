package com.practiseProblems;

import org.junit.jupiter.api.Test;

import static com.practiseProblems.Anagrams.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramsTest {
    @Test
    public void isAnagramTest() {
        assertTrue(isAnagram("", ""));
        assertTrue(isAnagram("A", "A"));
        assertTrue(isAnagram("ab", "ba"));
        assertTrue(isAnagram("AB", "ab"));
        assertTrue(isAnagram("anagram", "nagaram"));

        assertFalse(isAnagram("A", "B"));
    }
}