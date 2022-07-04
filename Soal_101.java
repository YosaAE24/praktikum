package com.praktikum;

import java.util.Scanner;

public class Soal_101 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        double R, luas, keliling;
        System.out.print("Masukkan Nilai Jari-jari: ");
        R = masukan.nextDouble();

        luas = 3.14 * R * R;
        keliling = 2 * 3.14 * R;

        System.out.println("Hasil Luas lingkaran: "+ luas);
        System.out.println("Hasil Keliling Lingkaran: "+ keliling);
    }
}
