package com.example.uygulama1;


import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
         double maas,yeniMaas;
         System.out.print("Maaş Gir: ");
         maas=oku.nextDouble();

         yeniMaas=maas+(maas+0.43);

         System.out.println("Yeni Maaşınız: "+yeniMaas);
    }
}
