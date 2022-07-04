package com.praktikum;

import java.util.Scanner;

public class prak_402 {
    public static void main (String[] args) {
        int[] nilai= new int[10];
        int min = 0, max = 0;

        Scanner masukan = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.println("Program Menjumlahkan 2 bilangan");
        System.out.print("Masukkan bilangan 1 : ");
        bil1 = masukan.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = masukan.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        bil3 = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah bil1 + bil2 : "+(jumlah(bil1,bil2)));
        System.out.println("Jumlah bil2 + bil3 : "+(jumlah(bil2,bil3)));
        System.out.println("Jumlah bil1 + bil3 : "+(jumlah(bil1,bil3)));



        for (int i=0; i<10; i++) {
            if(nilai[i] > max) {
                max = nilai[i];
            } else if(nilai[i] < min) {
                min = nilai[i];
            }
        }
    }

    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
}

