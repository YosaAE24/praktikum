package com.praktikum;

import java.util.Scanner;
public class Prak_106 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        float celcius, reamur;
        System.out.print("Masukkan nilai suhu (celcius) : ");
        celcius = masukan.nextFloat(); reamur = 0.8f * celcius; System.out.println();
        System.out.print("nilai suhu reamur dari input : ");
        System.out.println(reamur);
    }
}
