package com.java.strng;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Anagram {

    private String s1, s2;

    public void isAnagram(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;

        if (s1.length() != s2.length()) {
            System.out.println("String " + s1 + " is not anagram of " + s2);
        } else {
            char[] s1a = s1.toCharArray();
            char[] s2a = s2.toCharArray();

            Arrays.sort(s1a);
            Arrays.sort(s2a);

            int k = 0;

            for (int i = 0; i<s1a.length; i++) {
                if (s1a[i] == s2a[k]) {
                    k++;
                }
            }
            System.out.println("String " + s1 + " is anagram of " + s2);
        }
    }
}
