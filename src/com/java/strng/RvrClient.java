package com.java.strng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class RvrClient {
    public static void main(String[] args) throws IOException{

         String s1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        s1 = br.readLine();

        RvrString r = new RvrString(s1);
        String s2 = r.ReverseString();
        System.out.println(s2);

    }
}
