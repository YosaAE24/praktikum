package com.praktikum;

import java.util.Scanner;

public class prak_502 {
    public static void main (String[] args) {
        int baris, kolom;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Program Penjumlahan 2 buah matriks");
        System.out.print("Masukkan jumlah baris Matriks : ");
        baris = masukan.nextInt();
        System.out.print("Masukkan jumlah kolom Matriks : ");
        kolom = masukan.nextInt();
        System.out.println();
        System.out.println("Masukkan data : ");
        System.out.println("Matriks 1 : ");
        int matriks1[][] = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Bil baris ke-"+i+" kolom ke-"+j+" : ");
                matriks1[i][j] = masukan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks 2 : ");
        int matriks2[][] = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Bil baris ke-"+i+" kolom ke-"+j+" : ");
                matriks2[i][j] = masukan.nextInt();
            }
        }
        System.out.println("Data sebelum dijumlahkan : ");
        System.out.println("Matriks 1 : ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++)
                System.out.print(matriks1[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks 2 : ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++)
                System.out.print(matriks2[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        int hasil[][] = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++)
                hasil[i][j] = matriks1[i][j]+matriks2[i][j];
        }
        System.out.println("Hasil penjumlahan Matriks tersebut : ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++)
                System.out.print(hasil[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}
