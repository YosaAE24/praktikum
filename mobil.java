package com.praktikum;

public class mobil implements komponen{

    public static void main(String []args) {
        mobil data = new mobil();
        data.mesin();
        data.design();
    }

    @Override
    public void mesin() {
        System.out.println("kecepatan Mobil = "+ kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mempunyai Model = "+ model);
    }
}
