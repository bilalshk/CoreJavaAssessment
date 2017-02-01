package com.java.fle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bilalshaikh on 2/1/17.
 */
public class FileAssessment {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/bilalshaikh/input.txt");

        if (!file.exists()) {
            //Create new file if not exists
            file.createNewFile();
        } else {

            //Add lines to file
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Bilal");
            pw.println("Rishabh");
            pw.println("Natesh");
            pw.println("Rawjyot");
            pw.flush();
            pw.close();

            //Read the lines
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            File file1 = new File("/Users/bilalshaikh/input_cpy.txt");
            file1.createNewFile();

            FileWriter fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            PrintWriter pw1 = new PrintWriter(bw1);

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                //Copy in new file
                pw1.println(s);
                pw1.flush();
            }
        }
    }
}
