package com.praktikum;

import java.util.Scanner;
public class prak_302 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan batas bilangannya : ");
        int batas = masukan.nextInt();
        System.out.println("Bilangan genap dari 2 sampai bil tsb : ");
        for(int i=2; i<=batas; i=i+2)
            System.out.print(i + " ");
    }
}
