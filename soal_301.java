package com.praktikum;

import java.util.Scanner;

public class soal_301 {
    public static void main(String []args){
        System.out.println("NAMA : YOSA ADYTIA PRATAMA");
        System.out.println("NIM : 21533400");
        System.out.println();
        System.out.println ("PROGRAM MENGHITUNG BESAR BUNGA DAN LAMA ANGSURAN");

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukk  jumlah Hutang = ");
        int hutang = masukkan.nextInt();
        System.out.print("Masukkan lama Angsuran = ");
        int lama = masukkan.nextInt();
        System.out.print("Masukkan besar bunga (%) = ");
        int bunga = masukkan.nextInt();

        int n = 0;
        int jumlahBunga;
        int total;
        int bayar;

        for (int i = 0; i < lama;i++){
            jumlahBunga = (hutang - n)/bunga;
            total = hutang + jumlahBunga;
            bayar = total / lama;
            n += bayar;
            System.out.print("Cicilan Ke - "+(i+1)+" bayar = "+bayar+" total yang sudah dibayar = "+n+"\n");
        }
        System.out.println();
        System.out.println("Hutang = " +hutang+ " dengan bunga sebesar = "+bunga+"% LUNAS ");
        System.out.println();
    }
}
