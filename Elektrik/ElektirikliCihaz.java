package com.example.uygulama1;

public class ElektirikliCihaz {
    public String CihazAdi;
    public double CihazGucu;
    public double GunlukKullanimSaaati;

    public double aylikTuketim(){
        double aylikKullanim;
        aylikKullanim=CihazGucu*GunlukKullanimSaaati*30*2.07;
        return aylikKullanim;

    }
    public double getGunlukKullanimSaaati(){
        double aylikKullanim;
        aylikKullanim=CihazGucu*GunlukKullanimSaaati*2.07;
        return aylikKullanim;
    }
}
