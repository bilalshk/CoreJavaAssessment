package com.java.fle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bilalshaikh on 2/1/17.
 */
public class FileCopyAssessment {
    public static void main(String[] args) throws IOException{

        File in = new File("/Users/bilalshaikh/input.txt");

        if (!in.exists()) {

            in.createNewFile();

        } else {

            FileReader fri = new FileReader(in);
            BufferedReader bri = new BufferedReader(fri);

            FileWriter fwi = new FileWriter(in);
            BufferedWriter bwi = new BufferedWriter(fwi);
            PrintWriter pwi = new PrintWriter(bwi);

            //Insert into input.txt
            pwi.println("Hello Bilal");
            pwi.println("Hello Rishabh");
            pwi.println("Hello Natesh");
            pwi.println("Hello Rawjyot");
            pwi.flush();
            pwi.close();

            //Display input.txt
            System.out.println("Input File Data");
            String s;
            while( (s = bri.readLine()) != null){
                System.out.println();
                System.out.println(s);
            }
            fri.close();
            bri.close();

            //Copy Data
            FileInputStream ins = null;
            FileOutputStream outs = null;

                File infile =new File("/Users/bilalshaikh/input.txt");
                File outfile =new File("/Users/bilalshaikh/input_copy.txt");
                ins = new FileInputStream(infile);
                outs = new FileOutputStream(outfile);
                int da;

                while ((da = ins.read()) != -1) {
                    outs.write(da);
                }
                ins.close();
                outs.close();
                System.out.println();
                System.out.println("Copied Successfully!!");
        }
    }
}
