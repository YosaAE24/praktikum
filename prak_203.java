package com.praktikum;
import java.util.Scanner;
    public class prak_203 {
        public static void main(String[] args) {
            Scanner masukan = new Scanner(System.in);
            System.out.print("Masukkan nilai mata kuliahnya: ");
            int nilai = masukan.nextInt();
            if (nilai >= 80) {
                System.out.println("Nilainya A");
            }else if (nilai >= 70) {
                System.out.println("Nilainya B");
            }else if (nilai >= 55)
                System.out.println("Nilainya C");
            else if (nilai >= 40) {
                System.out.println("Nilainya D");
            }else
                System.out.println("Nilainya E");
        }
    }
