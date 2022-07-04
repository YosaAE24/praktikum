package com.praktikum;

import java.util.Scanner;

public class soal_501 {
    static int [] bil=null;
    static int jmlhBilangan;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("MENU UTAMA");
            System.out.println("==============");
            System.out.println("1. input data");
            System.out.println("2. tampilkan data");
            System.out.println("3. distribusi frekuensi");
            System.out.println("4. statistik");
            System.out.println("5. keluar");
            System.out.println();
            System.out.println("Masukan pilihan : ");
            pilih = in.nextInt();
            switch (pilih){
                case 1 : inputData();break;
                case 2 : tampilkanData();break;
                case 3 : distribusiFrekuensi();break;
                case 4 : statistik();break;
                case 5 : System.out.println("SELESAI");
                    break;
                default : System.out.println("pilihan tidak ada");
                    System.out.println();
            }
        } while (pilih!=5);
    }

    private static void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.println("INPUTAN DATA");
        System.out.println("Masukan jumlah bilangan = ");
        jmlhBilangan = in.nextInt();
        bil = new int[jmlhBilangan];

        for (int i=0;i<jmlhBilangan;i++){
            System.out.println("Masukan bilangan ke- "+(i+1)+" dari 1-100: ");
            bil[i]=in.nextInt();
        }
        System.out.println();
    }

    private static void tampilkanData(){
        if(bil==null){
            System.out.println("-Lakukan inputan dahulu-");
            System.out.println();return;}
        System.out.println("Data yang anda input : ");

        for(int i=0;i<jmlhBilangan;i++){
            System.out.println("| "+bil[i]+" | ");
        }
        System.out.println();
    }

    private static void distribusiFrekuensi(){
        if(bil==null){
            System.out.println("-Lakukan inputan dahulu-");
            System.out.println();return;}
        int range1=0,range2=0, range3=0,range4=0,range5=0;

        for(int i=0;i<jmlhBilangan;i++){
            if(bil[i]>=1&&bil[i]<=20)
                range1++;
            else if(bil[i]>=21&&bil[i]<=40)
                range2++;
            else if(bil[i]>=41&&bil[i]<=60)
                range3++;
            else if(bil[i]>=61&&bil[i]<=80)
                range4++;
            else if(bil[i]>=81&&bil[i]<=100)
                range5++;
        }

        System.out.println("DISTRIBUSI FREKUENSI");
        System.out.println("Distribusi frekuensi dari 1-20 : "+range1);
        System.out.println("Distribusi frekuensi dari 21-40 : "+range2);
        System.out.println("Distribusi frekuensi dari 41-60 : "+range3);
        System.out.println("Distribusi frekuensi dari 61-80 : "+range4);
        System.out.println("Distribusi frekuensi dari 81-100 : "+range5);
        System.out.println();
    }

    private  static void statistik(){
        if(bil==null){
            System.out.println("-Lakukan inputan dahulu-");
            System.out.println();
            return;
        }
        double total=0;
        for(int i=0;i<jmlhBilangan;i++)
            total+=bil[i];
        double rerata=total/jmlhBilangan;
        int min=bil[0],maks=bil[0];
        for(int i=0;i<jmlhBilangan;i++){
            if(bil[i]<=min)
                min=bil[i];
            if(bil[i]>=maks)
                maks=bil[i];
        }
        System.out.println("STATISTIK");
        System.out.printf("Nilai rata-rata : %.0f\n",rerata);
        System.out.println("Nilai minimum : "+min);
        System.out.println("Nilai maksimum : "+maks);
        System.out.println();
    }
}
