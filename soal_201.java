package com.praktikum;

import java.util.Scanner;

public class soal_201 {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("PROGRAM PENENTUAN TITIK KEGEMUKAN");
        System.out.println("=============================================");
        double bb, tb, imt, t;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan Anda: ");
        bb = masukan.nextDouble();
        System.out.print("Masukkan Tinggi Badan Anda: ");
        tb = masukan.nextDouble();

        System.out.println("---------------------------------------------");

        t = tb * tb;
        imt = bb / t;

        if (imt <= 18.5) {
            System.out.println("Kurus");
        } else if (imt < 18.5 && imt <= 25) {
            System.out.println("Normal");
        } else if (imt < 25 && imt <= 30) {
            System.out.println("Gemuk");
        } else if (imt > 30) {
            System.out.println("Kegemukan (Obesitas)");
        }

        System.out.println("---------------------------------------------");

    }
}