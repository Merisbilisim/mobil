package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        int yazili1,yazili2,toplam,ortalama;
        Scanner oku=new Scanner(System.in);

        System.out.println("Yazılı1 Gir: ");
        yazili1=oku.nextInt();

        System.out.print("Yazılı2 Gir: ");
        yazili2=oku.nextInt();

        toplam=yazili1*yazili2;

        ortalama=(yazili1+yazili2)/2;

        System.out.print("Ortalamanız: "+ortalama);


    }
}
