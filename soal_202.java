package com.praktikum;

import java.util.Scanner;

public class soal_202 {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("PROGRAM PENENTUAN GAJI KARYAWAN");
        System.out.println("=============================================");
        int total_gaji, jam_kerja, bolos, gaji_lembur, lembur;

        Scanner masukkan = new Scanner(System.in);
        System.out.print("Nama Karyawan: ");
        String nama_karyawan = masukkan.nextLine();
        System.out.println("Masukkan total jam kerja dalam seminggu: ");
        jam_kerja = masukkan.nextInt();

        System.out.println("---------------------------------------------");

        total_gaji = jam_kerja * 5000;
        bolos = (jam_kerja * 2500);
        gaji_lembur = total_gaji + ((jam_kerja - 60 ) * 7500);
        lembur = jam_kerja - 60;

        if (jam_kerja >= 50 && jam_kerja <= 60) {
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Dengan Total jam Kerja: " + jam_kerja);
            System.out.println("Total Gajimu Adalah: " + total_gaji);
        } else if (jam_kerja < 50) {
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Dengan Total jam Kerja: " + jam_kerja);
            System.out.println("Total Gajimu Adalah: " + bolos);
        } else if (jam_kerja > 60) {
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Dengan Total jam Kerja: " + jam_kerja + " Dan Total jam Lembur: " + lembur);
            System.out.println("Total Gajimu Adalah: " + gaji_lembur);

            System.out.println("---------------------------------------------");
        }
    }

}
