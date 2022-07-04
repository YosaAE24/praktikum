package com.praktikum;

import java.util.Scanner;
public class prak_304 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan batas bilangannya : ");
        int batas = masukan.nextInt();
        int kelipatan = masukan.nextInt();

        for( int i=kelipatan; i<=batas; i = i + kelipatan)
            System.out.println(i);
//            if (i == batas) {
//                System.out.println("Total jumlahnya adalah : " + i);
//                break;
//            }
    }
}
