package com.example.uygulama1;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int ortalama;
        System.out.print("Ortalama:  ");
        ortalama= oku.nextInt();

        if(ortalama>=0 && ortalama<50){
            System.out.println("1 le Kaldı");
        }
       else if(ortalama>=50 && ortalama<60){
            System.out.println("2 le Gecti");
        }
       else if(ortalama>=60 && ortalama<70){
            System.out.println(" 3 le gecti");
        }
       else if(ortalama>=70 && ortalama<85){
            System.out.println("4 le gecti");
        }
       else{
            System.out.println(" 5 le gecti");
        }

    }
}
