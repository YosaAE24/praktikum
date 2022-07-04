package com.praktikum;


public class soal_403 {


    public static boolean Amisabel(int x){
        int total = 0;
        if(x == 1) return true;
        else {
            for (int i = 1; i < x; i++) if (x % i == 0) total += i;
            if (total == x) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("NAMA : YOSA ADYTIA PRATAMA");
        System.out.println("NIM : 21533400");
        System.out.println();
        System.out.println ("PROGRAM MENAMPILKAN BILANGAN AMISABEL");
        for(int i = 1; i <= 1000; i++){
            if(Amisabel(i)){
                System.out.print(i+" = ");

                for(int x = 1; x <= i; x++){
                    if (i % x == 0) {
                        System.out.print(x);

                        if((i == 1)|| (i / x == 2)) break;

                        if( x != i) {
                            System.out.print(" + ");
                        }
                    }
                }

                System.out.println("");
            }
        }
    }
}
