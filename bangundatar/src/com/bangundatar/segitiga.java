package com.bangundatar;

public class segitiga extends info implements luas_keliling{
    int alas, tinggi, sisia, sisib;
    public segitiga(int a, int b, int c, int d){
        alas=a;
        tinggi=b;
        sisia=c;
        sisib=d;
    }
    @Override
    public double luas() {
        return alas * tinggi / 2;
    }
    @Override
    public double keliling() {
        return alas + sisia + sisib;
    }
    public void show_sudut() {
        System.out.println("Jumlah Sudut Segitiga Adalah 3 Dengan Total 180 Derajat ");
    }
    public void show_info(){
        System.out.println(" Luas  :  " +luas());
        System.out.println(" Keliling  :  " +keliling());
    }
}
