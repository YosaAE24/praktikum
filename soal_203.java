package com.praktikum;

import java.util.Scanner;

public class soal_203 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int x, y;
        System.out.println("=============================================");
        System.out.println("PROGRAM PENENTUAN TITIK KUADRAN");
        System.out.println("=============================================");
        System.out.printf("\t\tInput x : ");
        x = masukan.nextInt();

        System.out.printf("\t\tInput y : ");
        y = masukan.nextInt();

        System.out.println("---------------------------------------------");
        if(x > 0 && y > 0){
            System.out.printf("\t\tQuadrant I");
        }
        else if(x < 0 && y > 0){
            System.out.printf("\t\tQuadrant II");
        }
        else if(x < 0 && y < 0){             System.out.printf("\t\tQuadrant III");         }         else if(x > 0 && y < 0){
            System.out.printf("\t\tQuadrant IV");
        }
        else {
            System.out.printf("\tPlease Input x and y Other");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
    }
}
