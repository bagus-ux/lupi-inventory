package com.luasbagundatar;

import java.util.Scanner;

public class bangundatar { //parentclass
    double keliling;
    double luas;

}
//inherintance
class lingkaran extends bangundatar{ //childclass
    double jari2;
    private double phi; //enkapsulasi

    //setter
    void setPhi(double phi){
        this.phi = phi;
    }
    //getter
    double getPhi(){
        return phi;
    }

    public void setjari(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukan jari-Jari = ");
        jari2 = input.nextDouble();
    }

    private double LuasLingkaran(){
    luas=phi * jari2 * jari2;
    return luas;
    }
    private double KelilingLingkaran(){
        keliling=2 * phi * jari2;
        return keliling;
    }
    public void tampilkan_lingkaran(){ //methods
        System.out.println("Luas Lingkaran Adalah : " +LuasLingkaran());
        System.out.println("Keliling Lingkaran Adalah : " +KelilingLingkaran());
    }
}
class persegi_panjang extends bangundatar{
    int panjang;
    int lebar;

    public void setPanjang(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("Masukan Panjang = ");
        panjang = input.nextInt();
    }
    public void setLebar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Lebar = ");
        lebar = input.nextInt();
    }

    private double LuasPersegiPanjang(){
        luas=panjang * lebar;
        return luas;
    }
    private double KelilingPersegipanjang(){
        keliling = 2 * (panjang+lebar);
        return keliling;
    }
    public void tampilkan_persegipanjang(){
        System.out.println("Luas Persegi Panjang Adalah : " +LuasPersegiPanjang());
        System.out.println("Luas Persegi Panjang Adalah : " +KelilingPersegipanjang());
    }
}
class persegi extends bangundatar{
    int sisi;

    public void setSisi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Persegi");
        System.out.println("Masukan Sisi = ");
        sisi = input.nextInt();
    }

    private double LuasPersegi(){
        luas=sisi * sisi;
        return luas;
    }
    private double KelilingPersegi(){
        keliling = 4 * sisi;
        return keliling;
    }
    public void tampilkan_persegi(){
        System.out.println("Luas Persegi Panjang Adalah : " +LuasPersegi());
        System.out.println("keliling Persegi Panjang Adalah : " +KelilingPersegi());
    }
}
class segitiga extends bangundatar{
    int alas, tinggi, sisia, sisib;

    public void setAlas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Masukan Alas = ");
        alas = input.nextInt();
    }
    public void setTinggi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Tinggi = ");
        tinggi = input.nextInt();
    }
    public void setSisia(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Sisi A = ");
        sisia = input.nextInt();
    }
    public void setSisib(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Sisi B = ");
        sisib = input.nextInt();
    }
    private double LuasSegitiga(){
        luas=alas * tinggi /2;
        return luas;
    }
    private double KelilingSegitiga(){
        keliling = alas + sisia + sisib;
        return keliling;
    }
    public void tampilkan_segitiga(){
        System.out.println("Luas Persegi Adalah : " +LuasSegitiga());
        System.out.println("Keliling Persegi Adalah : " +KelilingSegitiga());
    }
}
