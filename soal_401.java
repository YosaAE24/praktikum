package com.praktikum;

import java.util.Scanner;
public class soal_401 {
    public static void main(String args[]) {
        System.out.println("NAMA : YOSA ADYTIA PRATAMA");
        System.out.println("NIM : 21533400");
        System.out.println();
        System.out.println ("PROGRAM MENAMPILKAN BILANGAN PRIMA");
        Scanner input = new Scanner(System.in);
        int bil;

        System.out.println("----------------------------------------------");
        for (int i=1; i<=100; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}