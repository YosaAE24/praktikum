package com.praktikum;

import java.util.Scanner;
public class soal_303 {
    public static void main(String args[]) {
        System.out.println("NAMA : YOSA ADYTIA PRATAMA");
        System.out.println("NIM : 21533400");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;

        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.print("Mulai dari : ");
        awal=input.nextInt();
        System.out.print("Sampai : ");
        akhir=input.nextInt();
        System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
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
