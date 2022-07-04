package com.praktikum;

import java.util.Scanner;
public class prak_306 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        int n=0, total=0, bil=9;
        while (bil!=0){
            n++;
            System.out.println("Masukkan bilangan ke-"+n+" : ");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.print("Total jumlah "+(n-1)+" bilangan tsb : "); System.out.println(total);
//        int i = 1;
//        do {
//            System.out.println("HalLo World"+ " Ke "+i);
//            i++;
//        } while (i <= 5);
    }
}
