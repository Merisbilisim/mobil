package com.example.uygulama1;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        int uzun,kisa,cevre,alan;
        
        Scanner oku=new Scanner(System.in);
        System.out.print("Uzun Kenar Gir: ");
        uzun=oku.nextInt();

        System.out.print("Kısa Kenar Gir ");
        kisa=oku.nextInt();

        cevre=2*(kisa+uzun);
        System.out.println("Çevre "+cevre);
        alan=kisa*uzun;
        System.out.print("Alan "+alan);



    }
}
