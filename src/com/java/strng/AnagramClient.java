package com.java.strng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class AnagramClient {
    public static void main(String[] args) throws IOException{

        String s1, s2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first string: ");
        s1 = br.readLine();

        System.out.println("Enter the second string: ");
        s2 = br.readLine();

        Anagram an = new Anagram();

        an.isAnagram(s1, s2);

    }
}
