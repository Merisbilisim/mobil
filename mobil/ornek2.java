package com.example.uygulama1;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int derece;

        System.out.print("Sıcaklık derecesi:  ");
        derece= oku.nextInt();

    if(derece<=5){
        System.out.println("cok Soguk");
    }
    else if(derece<=20){
        System.out.println("Soğuk");

    }
    else if(derece<=27){
        System.out.println("Normal");
    }
    else if(derece<=35){
        System.out.println("Sıcak");
    }
    else {
        System.out.println("çok sıcak");
    }
    }
}
