package com.praktikum;

import java.util.Scanner;
public class prak_205 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in); System.out.print("Masukkan angka 1 - 3 : ");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1 : System.out.println("Satu");
                break;
            case 2 : System.out.println("Dua");
                break;
            case 3 : System.out.println("Tiga");
                break;
            default : System.out.println("Bilangan di luar range");
        }
    }
}
