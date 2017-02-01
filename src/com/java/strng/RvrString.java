package com.java.strng;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class RvrString {
    public String s1;

    public RvrString(String input){

        this.s1 = input;
    }

    public String ReverseString() {
        String s2 = "";
        int len = s1.length();

        for (int i = len - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        return s2;
    }
}