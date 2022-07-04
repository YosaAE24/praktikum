package com.praktikum;

import java.util.Scanner;

public class prak_401 {
        public static void main (String[] args) {
            Scanner masukan = new Scanner(System.in);
            int pilihan=9;
            do {
                System.out.println("\nMENU\n");
                System.out.println("1. Menghitung Luas Persegi Panjang");
                System.out.println("2. Menghitung Luas Lingkaran");
                System.out.println("0. Keluar");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan = masukan.nextInt();
                switch(pilihan){
                    case 1 : luasPersegiPanjang();break;
                    case 2 : luasLingkaran();break;
                }
            } while(pilihan != 0);
        }

        private static void luasPersegiPanjang(){
            Scanner masukan = new Scanner(System.in);
            float panjang, lebar, luas;
            System.out.print("Masukkan nilai panjang : ");
            panjang = masukan.nextFloat();
            System.out.print("Masukkan nilai lebar : ");
            lebar = masukan.nextFloat();
            luas = panjang * lebar;
            System.out.println("Luas Persegi Panjang : " + luas);
        }


        private static void luasLingkaran(){
            Scanner masukan = new Scanner(System.in);
            float jari2, luas;
            System.out.print("Masukkan nilai jari-jari : ");
            jari2 = masukan.nextFloat();
            luas = 3.14f * jari2 * jari2;
            System.out.println("Luas Lingkaran : " + luas);
        }
}
