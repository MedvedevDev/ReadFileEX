package com.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try{
            File myFile = new File("D:\\Java\\ReadFileEX\\readme.txt");
            FileReader fr = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fr);

            String readStr;

            //while ((readStr = reader.readLine()) != null) {
           //     System.out.print(readStr);
          //  }

            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        String toSplit = "Lorem Ipsum is/ simply dummy text / of the printing and typesetting industry.";
        String[] res = toSplit.split("/");

        for (String token:res) {
            System.out.println(token);
        }

        System.out.println(res[0]);
    }
}
