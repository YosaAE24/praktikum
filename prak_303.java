package com.praktikum;

import java.util.Scanner;
public class prak_303 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan : ");
        int bil = masukan.nextInt();
        boolean prima = true;
        for(int i=4; i<bil; i++){
            if ((bil % i)== 0) {
                prima = false; break;}
        }
        if (prima)
            System.out.print(bil + " Bilang yang dapat dibagi 4");
        else
            System.out.print(bil + "  Bilang yang tidak dapat dibagi 4");
    }
}
