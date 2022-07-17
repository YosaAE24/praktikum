package com.praktikum;

import java.io.*;
public class soal_601 {
    public static void main(String[] args)throws Exception {
        File file = new File("src/Soal_601/mhs.txt");
        if (!file.exists() || !file.canRead()){
            System.out.println("Can't Read"+ file);
            return;
        }
        try {
            int i=0;
            BufferedReader fIn = new BufferedReader(new FileReader(file));
            String line;
            while((line = fIn.readLine()) != null){
                i++;
                System.out.println(i+" : "+line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }

    }
}
