package com.example.uygulama1;

public class Metot3 {
    public static void main(String[] args) {
      int s1=9;
      int s2=5;


        System.out.println("sonuç: "+farkHesapla(s1,s2));

    }
    public static int farkHesapla(int s1,int s2){
        int fark;
        if (s1>s2){
           return s1-s2;
        }
        else{
            return s2-s1;
        }
    }

}
