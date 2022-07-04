package com.praktikum;

import java.util.Scanner;
public class prak_206 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai Matematika-nya :");
        int matematika = masukan.nextInt(); System.out.print("Masukkan nilai Fisika-nya : ");
        int fisika = masukan.nextInt();
        if ((matematika > 80) && (fisika > 70)) System.out.println("Siswa tersebut DITERIMA");
        else
            System.out.println("Siswa tersebut TIDAK DITERIMA");
    }
}
